package chapter_1.ch1_3;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Stack
 */
public class Stack<Item> implements Iterable<Item>{
    private Node first;
    private int N;
    private class Node {
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;
        N++;
    }

    public Item pop(){
        Item item=first.item;
        first=first.next;
        N--;
        return item;
    }

    /**
     * EX1.3.7
     */
    public Item peek(){
        if(isEmpty())
            throw new NoSuchElementException("Stack underflow");
        return first.item;
    }

    /**
     * EX1.3.12
     */
    @Override
    public Iterator<Item> iterator(){
        return new ListIterator();
    }

    private class ListIterator  implements Iterator<Item>{
        private Node current=first;

        @Override
        public boolean hasNext(){
            return current!=null;
        }

        @Override
        public void remove(){}

        @Override
        public Item next(){
            Item item=current.item;
            current=current.next;
            return item;
        }
    }
}