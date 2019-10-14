package chapter_3.ch3_4;

/**
 * SeparateChainingHashST_a
 */
public class SeparateChainingHashST_a<Key, Value> {
    private int M;
    private int N;
    private Node[] st;

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

    public SeparateChainingHashST_a(){
        this(997);
    }

    public SeparateChainingHashST_a(int M){
        this.M=M;
        this.N=0;
        st=(Node [])new Node[M];
    }

    private int hash(Key key){
        return (key.hashCode()&0x7fffffff)%M;
    }

    public Value get(Key key){
        for(Node x=st[hash(key)];x!=null;x=x.next){
            if(key.equals(x.key))
                return x.val;
        }
        return null;
    }

    public void put(Key key, Value val){
        for(Node x=st[hash(key)];x!=null;x=x.next){
            if(key.equals(x.key)){
                x.val=val;
                return;
            }
        }
        st[hash(key)]=new Node(key,val,st[hash(key)]);
        N++;
    }
    
}