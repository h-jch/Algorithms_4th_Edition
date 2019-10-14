package chapter_3.ch3_1;

/**
 * OrderedSequentialSearchST
 */
public class OrderedSequentialSearchST<Key extends Comparable<Key>, Value> {
    private Node first;
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
        for(Node x=first;key.compareTo(x.key)>0;x=x.next){
            if(key.equals(x.key))
                return x.val;
        }
        return null;
    }

    public void put(Key key, Value val){
        for(Node x=first;key.next.key.compareTo(x.key)>0;x=x.next){
            if(key.equals(x.next.key)){
                x.next.val=val;
                return;
            }
        }
        x=new Node(key, val, x.next);
    }
    
}