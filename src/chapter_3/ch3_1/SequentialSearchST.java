package chapter_3.ch3_1;

import chapter_1.ch1_3.Queue;

/**
 * SequentialSearchST
 */
public class SequentialSearchST<Key, Value> {
    private Node first;
    private int N;
    private class Node{
        Key key;
        Value val;
        Node next;

        public Node(Key key, Value val, Node next){
            this.key=key;
            this.val=val;
            this.next=next;
        }
    }

    public Value get(Key key){
        for(Node x=first;x!=null;x=x.next)
            if(key.equals(x.key))
                return x.val;
        return null;
    }

    public void put(Key key, Value val){
        for(Node x=first;x!=null;x=x.next)
            if(key.equals(x.key)){
                x.val=val;
                return;
            }
        first=new Node(key,val,first);
        N++;
    }
    
    /**
     * EX3.1.5
     */
    public int size(){
        return N;
    }

    public void delete(Key key){
        Node x=first;
        while(x!=null){
            if(key.equals(x.key))
                break;
            x=x.next;
        }
        if(x==null)
            return;
        x.val=x.next.val;
        x.next=x.next.next;
        N--;
    }

    public Iterable<Key> keys(){
        Queue<Key> q=new Queue<>();
        for(Node x=first;x!=null;x=x.next)
            q.enqueue(x.key);
        return q;
    }
}