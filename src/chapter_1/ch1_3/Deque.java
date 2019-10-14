package chapter_1.ch1_3;

import java.util.Iterator;

/**
 * Deque
 */
public class Deque<Item> implements Iterable<Item>{
    private DoubleNode first;
    private DoubleNode last;
    private int N;
    private class DoubleNode{
        Item item;
        DoubleNode prev;
        DoubleNode next;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }

    public void pushLeft(Item item){
        DoubleNode oldfirst=first;
        first=new DoubleNode();
        first.item=item;
        if(isEmpty()){
            last=first;
        }else{
            first.next=oldfirst;
            oldfirst.prev=first;
        }
        N++;
    }

    public void pushRight(Item item){
        DoubleNode oldlast=last;
        last=new DoubleNode();
        last.item=item;
        if(isEmpty()){
            first=last;
        }else{
            oldlast.next=last;
            last.prev=oldlast;
        }
        N++;
    }

    public Item popLeft(){
        Item item=first.item;
        first=first.next;
        if(isEmpty())
            last=first;
        first.prev=null;
        N--;
        return item;
    }


    public Item popRight(){
        Item item=last.item;
        last=last.prev;
        if(N==1)
            first=last;
        last.next=null;
        N--;
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