package chapter_3.ch3_4;

import chapter_3.ch3_1.SequentialSearchST;
import chapter_1.ch1_3.Queue;

/**
 * SeparateChainingHashST
 */
public class SeparateChainingHashST<Key, Value> {
    private int N;
    private int M;
    private SequentialSearchST<Key,Value>[] st;

    public SeparateChainingHashST(){
        this(997);
    }

    public SeparateChainingHashST(int M){
        this.M=M;
        st=(SequentialSearchST<Key,Value>[])new SequentialSearchST[M];
        for(int i=0;i<M;i++)
            st[i]=new SequentialSearchST<Key,Value>();
    }
    
    private int hash(Key key){
        return (key.hashCode()&0x7fffffff)%M;
    }

    public Value get(Key key){
        return (Value)st[hash(key)].get(key);
    }

    public void put(Key key, Value val){
        st[hash(key)].put(key, val);
    }

    /**
     * EX3.4.9
     */
    public void delete(Key key){
        st[hash(key)].delete(key);
    }

    /**
     * EX3.4.19
     */
    public Iterable<Key> keys(){
        Queue<Key> queue=new Queue<>();
        for(int i=0;i<M;i++){
            for(Key key:st[i].keys())
                queue.enqueue(key);
        }
        return queue;
    }
}