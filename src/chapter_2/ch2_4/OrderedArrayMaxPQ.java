package chapter_2.ch2_4;

import java.util.Arrays;

/**
 * OrderedArrayMaxPQ
 */
public class OrderedArrayMaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;

    public OrderedArrayMaxPQ(int max){
        pq=(Key[])new Comparable[max];
    }

    public OrderedArrayMaxPQ(Key[] a){
        N=a.length;
        pq=(Key[])new Comparable[N];
        for(int i=0;i<N;i++)
            pq[i]=a[i];
        Arrays.sort(pq);
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void insert(Key v){
        int i=N-1;
        for(;i>=0&&pq[i].compareTo(v)>0;i--)
            pq[i+1]=pq[i];
        pq[i+1]=v;
        N++;
    }

    public Key max(){
        return pq[N-1];
    }

    public Key delMax(){
        Key max=pq[--N];
        pq[N]=null;
        return max;
    }
    
}