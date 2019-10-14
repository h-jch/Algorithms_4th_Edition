package chapter_1.ch1_3;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * Queue
 */
public class Queue<Item> implements Iterable<Item>{      //环形链表实现Queue
    private Node first;
    private Node last;
    private int N;
    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return last==null;
    }

    public int size(){
        return N;
    }

    public void enqueue(Item item){
        Node oldlast=last;
        last=new Node();
        last.item=item;
        if(isEmpty())
            last.next=last;
        else{
            last.next=oldlast.next;
            oldlast.next=last;
        }
        N++;
    }

    public Item dequeue(){
        Item item=last.next.item;
        if(N==1)
            last=null;
        else
            last.next=last.next.next;
        N--;
        return item;
    }
    
    @Override
    public Iterator<Item> iterator(){
        return new ListIterator();
    }
    
    private class ListIterator implements Iterator<Item>{
        private Node current=first;

        @Override
        public boolean hasNext(){
            return current!=null;
        }

        @Override
        public Item next(){
            Item item=current.item;
            current=current.next;
            return item;
        }

        @Override
        public void remove(){}
    }
}