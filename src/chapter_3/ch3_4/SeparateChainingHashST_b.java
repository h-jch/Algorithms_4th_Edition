package chapter_3.ch3_4;

/**
 * SeparateChainingHashST_b
 */
public class SeparateChainingHashST_b<Key, Value> {
    private int M;
    private int N;
    private Node[] st;

    private class Node {
        Key key;
        Value val;
        Node next;
        int cnt;
        
        public Node(Key key, Value val, Node next){
            this.key=key;
            this.val=val;
            this.next=next;
            this.cnt=N;
        }
    }

    public SeparateChainingHashST_b(){
        this(997);
    }
    
    public SeparateChainingHashST_b(int M){
        this.M=M;
        st=(Node[])new Node[M];
    }

    private int hash(Key key){
        return (key.hashCode()&0x7fffffff)%M;
    }

    public Value get(Key key){
        for(Node x=st[hash(key)];x!=null;x=x.next){
            if(key.equals(x.key)){
                return x.val;
            }
        }
        return null;
    }

    public void put(Key key, Value val){
        for(Node x=st[hash(key)];x!=null;x=x.next){
            if(key.equals(x.key)){
                x.val=val;
                x.cnt=N;
                return;
            }
        }
        st[hash(key)]=new Node(key,val,st[hash(key)]);
        N++;
    }

    public void deleteAbove(int k){
        for(int i=0;i<M;i++){
            while(st[i].cnt>k){
                st[i]=st[i].next;
            }
            for(Node x=st[i];x.next!=null;x=x.next){
                if(x.next.cnt>k){
                    x.next=x.next.next;
                }
            }
        }
    }
}