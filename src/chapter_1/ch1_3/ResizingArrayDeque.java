package chapter_1.ch1_3;

import java.util.Iterator;
/**
 * ResizingArrayDeque
 */
public class ResizingArrayDeque<Item> implements Iterable<Item>{
    private Item[] a=(Item[])new Object[1];
    private int N;
    private void resize(int max){
        Item[] tmp=(Item[])new Object[max];
        for(int i=0;i<N;i++)
            tmp[i]=a[i];
        a=tmp;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void pushLeft(Item item){
        if(N==a.length)
            resize(s*a.length);
        for(int i=N;i>0;i--)
            a[N]=a[N-1];
        a[0]=item;
        N++;
    }

    public void pushRight(Item item){
        if(N==a.length)
            resize(2*a.length);
        a[N++]=item;
    }
    
    public Item popLeft(){
        Item item=a[0];
        for(int i=0;i<N-1;i++)
            a[i]=a[i+1];
        N--;
        a[N]=null;
        if(N>0&&N==a.length/4)
            resize(a.length/2);
        return item;
    }

    public Item popRight(){
        Item item=a[--N];
        a[N]=null;
        if(N>0&&N==a.length/4)
            resize(a.length/2);
        return item;
    }

    public Iterator<Item> Iterator(){
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item>{
        private Node current=first;

        public boolean hasNext(){
            return current!=null;
        }

        public void remove(){}

        public Item next(){
            Item item=current.item;
            current=current.next;
            return item;
        }
    }
}