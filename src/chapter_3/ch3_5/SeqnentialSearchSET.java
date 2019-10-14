package chapter_3.ch3_5;

import chapter_1.ch1_3.Queue;

/**
 * SeqnentialSearchSET
 */
public class SeqnentialSearchSET<Key> {
    private Node first;
    private int N;
    private class Node {
        Key key;
        Node next;

        public Node(Key key, Node next){
            this.key=key;
            this.next=next;
        }
    }

    public boolean isEmpty(){
        return first==null;
    }

    public boolean contains(Key key){
        for(Node x=first;x!=null;x=x.next){
            if(key.equals(x.key))
                return true;
        }
        return false;
    }

    public int size(){
        return N;
    }

    public void add(Key key){
        if(contains(key))
            return;
        first=new Node(key,first);
        N++;
    }

    public void delete(Key key){
        if(key.equals(first.key)){
            first=first.next;
            return;
        }
        for(Node x=first;x.next!=null;x=x.next){
            if(key.equals(x.next.key)){
                x.next=x.next.next;
            }
        }
    }

    public Iterable<Key> keys(){
        Queue<Key> queue=new Queue<>();
        for(Node x=first;x!=null;x=x.next)
            queue.enqueue(key);
        return queue;
    }

    @Override
    public String toString(){
        String s="";
        for(Node x=first;x!=null;x=x.next){
            s+=x.key+" ";
        }
        return s;
    }
}