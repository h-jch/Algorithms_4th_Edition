package chapter_2.ch2_4;

/**
 * MaxPQ
 */
public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N=0;

    public MaxPQ(int maxN){
        pq=(Key[])new Comparable[maxN+1];
    }

    public MaxPQ(Key[] a){
        N=a.length;
        pq=(Key[])new Comparable[N+1];
        for(int i=1;i<=N;i++)
            pq[i]=a[i-1];
        
        for(int k=N/2;k>=1;k--)
            sink(k);
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void insert(Key v){
        if(N==pq.length-1)
            resize(2*pq.length);
        pq[++N]=v;
        swim(N);
    }

    public Key delMax(){
        Key max=pq[1];
        exch(1,N--);
        pq[N++]=null;
        sink(1);
        if(N>0&&N==pq.length/4)
            resize(pq.length/2);
        return max;
    }

    private boolean less(int i, int j){
        return pq[i].compareTo(pq[j])<0;
    }

    private void exch(int i, int j){
        Key t=pq[i];
        pq[i]=pq[j];
        pq[j]=t;
    }

    private void swim(int k){
        while(k>1&&less(k/2,k)){
            exch(k/2,k);
            k=k/2;
        }
    }

    private void sink(int k){
        while(2*k<=N){
            int j=2*k;
            if(j<N&&less(j,j+1))
                j++;
            if(!less(k,j))
                break;
            exch(k,j);
            k=j;
        }
    }
    
    /**
     * EX2.4.22
     */
    private void resize(int max){
        Key[] a=(Key[])new Comparable[max+1];
        for(int i=1;i<=max;i++)
            a[i]=pq[i];
        pq=a;
    }
}