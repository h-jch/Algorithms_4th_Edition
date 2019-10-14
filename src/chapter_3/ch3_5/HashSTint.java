package chapter_3.ch3_5;

import chapter_1.ch1_3.Queue;

/**
 * HashSTint
 */
public class HashSTint {
    private int M=16;
    private int N;
    private Integer[] keys;
    private Integer[] vals;

    public HashSTint(){
        keys=new Integer[M];
        vals=new Integer[M];
    }

    public HashSTint(int cap){
        M=cap;
        keys=new Integer[M];
        vals=new Integer[M];
    }

    public int hash(Integer key){
        return (key.hashCode()&0x7fffffff)%M;
    }
    
    private void resize(int cap){
        HashSTint t=new HashSTint(cap);
        for(int i=0;i<M;i++)
            if(keys[i]!=null)
                t.put(keys[i],vals[i]);
        keys=t.keys;
        vals=t.vals;
        M=t.M;
    }

    public void put(Integer key, Integer val){
        if(N>=M/2)
            resize(M*2);
        int i;
        for(i=hash(key);keys[i]!=null;i=(i+1)%M)
            if(keys[i].equals(key))
                vals[i]=val;
        keys[i]=key;
        vals[i]=val;
        N++;
    }

    public Integer get(Integer key){
        for(int i=hash(key);keys[i]!=null;i=(i+1)%M)
            if(keys[i].equals(key))
                return vals[i];
        return null;
    }

    public Iterable<Integer> keys(){
        Queue<Integer> queue=new Queue<>();
        for(int i=0;i<M;i++)
            if(keys[i]!=null)
                queue.enqueue(keys[i]);
        return queue;
    }
}