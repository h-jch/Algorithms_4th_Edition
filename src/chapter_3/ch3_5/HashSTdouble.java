package chapter_3.ch3_5;

import chapter_1.ch1_3.Queue;

/**
 * HashSTdouble
 */
public class HashSTdouble {
    private int M=16;
    private int N;
    private Double[] keys;
    private Double[] vals;

    public HashSTdouble(){
        keys=new Double[M];
        vals=new Double[M];
    }

    public HashSTdouble(int cap){
        M=cap;
        keys=new Double[M];
        vals=new Double[M];
    }

    public int hash(Double key){
        return (key.hashCode()&0x7fffffff)%M;
    }
    
    private void resize(int cap){
        HashSTdouble t=new HashSTdouble(cap);
        for(int i=0;i<M;i++)
            if(keys[i]!=null)
                t.put(keys[i],vals[i]);
        keys=t.keys;
        vals=t.vals;
        M=t.M;
    }

    public void put(Double key, Double val){
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

    public Double get(Double key){
        for(int i=hash(key);keys[i]!=null;i=(i+1)%M)
            if(keys[i].equals(key))
                return vals[i];
        return null;
    }

    public Iterable<Double> keys(){
        Queue<Double> queue=new Queue<>();
        for(int i=0;i<M;i++)
            if(keys[i]!=null)
                queue.enqueue(keys[i]);
        return queue;
    }
}