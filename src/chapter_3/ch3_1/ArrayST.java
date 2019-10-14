package chapter_3.ch3_1;

import chapter_1.ch1_3.Queue;

/**
 * ArrayST
 */
public class ArrayST<Key, Value> {
    private Key[] keys;
    private Value[] vals;
    private int N;

    public ArrayST(int cap){
        keys=(Key[])new Object[cap];
        vals=(Value[])new Object[cap];
        N=0;
    }

    public void put(Key key, Value val){
        for(int i=0;i<N;i++){
            if(key.equals(keys[i])){
                vals[i]=val;
                return;
            }
        }
        keys[N++]=key;
        vals[N++]=val;
    }
    
    public Value get(Key key){
        for(int i=0;i<N;i++){
            if(key.equals(keys[i])){
                return vals[i];
            }
        }
        return null;
    }

    public void delete(Key key){
        for(int i=0;i<N;i++){
            if(key.equals(keys[i])){
                keys[i]=keys[N-1];
                vals[i]=vals[N-1];
                keys[N-1]=null;
                vals[N-1]=null;
                N--;
            }
        }
    }

    public boolean contains(Key key){
        return get(key)!=null;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public Iterable<Key> keys(){
        Queue<Key> q=new Queue<>();
        for(int i=0;i<N;i++)
            q.enqueue(keys[i]);
        return q;
    }
}