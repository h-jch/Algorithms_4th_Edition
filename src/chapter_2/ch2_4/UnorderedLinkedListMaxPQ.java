package chapter_2.ch2_4;

/**
 * UnorderedLinkedListMaxPQ
 */
public class UnorderedLinkedListMaxPQ<Key extends Comparable<Key>> {
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
        Node oldfirst=first;
        first=new Node();
        first.key=v;
        if(isEmpty())
            first.next=null;
        else
            first.next=oldfirst;
        N++;
    }

    public Key max(){
        Key max=first.key;
        Node p=first;
        while(p!=null){
            if(less(max,p.key))
                max=p.key;
            p=p.next;
        }
        return max;
    }

    public Key delMax(){
        Node p=first;
        Node preMaxIndex=first;
        Key max=first.key;
        while(p.next!=null){
            if(less(max,p.next.key)){
                preMaxIndex=p;
                max=preMaxIndex.next.key;
            }
            p=p.next;
        }
        preMaxIndex.next=preMaxIndex.next.next;
        N--;
        return max;
    }

    private boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }
}