package chapter_1.ch1_3;

/**
 * GeneralizedLinkedQueue
 */
public class GeneralizedLinkedQueue<Item> {
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

    public void insert(Item item){
        Node oldlast=last;
        last=new Node();
        last.item=item;
        last.next=null;
        if(isEmpty())
            first=last;
        else
            oldlast.next=last;
        N++;
    }

    public Item delete(int k){
        if(k<N)
            return null;
        Node t=first;
        k=k-1;
        while(k-->0)
            t=t.next;
        Item item=t.next.item;
        t.next=t.next.next;
        return item;
    }
}