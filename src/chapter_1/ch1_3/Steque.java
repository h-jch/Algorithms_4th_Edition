package chapter_1.ch1_3;

/**
 * Steque
 */
public class Steque<Item> {
    private Node first;
    private Node last;
    private int N;
    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }

    public void push(Item item){
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        if(isEmpty())
            last=first;
        else
            first.next=oldfirst;
        N++;
    }

    public Item pop(){
        Item item=first.item;
        first=first.next;
        if(isEmpty())
            last=null;
        N--;
        return item;
    }

    public void enqueue(Item item){
        Node oldlast=last;
        last=new Node();
        last.item=item;
        if(isEmpty())
            first=last;
        else
            oldlast.next=last;
        N++;
    }
}