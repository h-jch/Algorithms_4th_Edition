package chapter_2.ch2_4;

/**
 * OrderedLinkedListMaxPQ
 */
public class OrderedLinkedListMaxPQ<Key extends Comparable<Key>> {
    private Node first;
    private int N;
    private class Node{
        Key key;
        Node next;
    }
    
    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }

    public void insert(Key v){
        Node p=first;
        while(p.next!=null){
            if(less(p.next.key,v))
                break;
        }
        Node t=new Node();
        t.key=v;
        t.next=p.next;
        p.next=t;
        N++;
    }

    public Key max(){
        return first.key;
    }

    public Key delMax(){
        Key max=first.key;
        first=first.next;
        N--;
        return max;
    }

    private boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }
}