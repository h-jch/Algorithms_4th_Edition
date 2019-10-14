package chapter_2.ch2_4;

/**
 * UnorderedArrayMaxPQ
 */
public class UnorderedArrayMaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;

    public UnorderedArrayMaxPQ(int max){
        pq=(Key[])new Comparable[max];
    }

    public UnorderedArrayMaxPQ(Key[] a){
        pq=(Key[])new Comparable[a.length];
        for(int i=0;i<a.length;i++)
            pq[i]=a[i];
        N=a.length;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void insert(Key v){
        pq[N++]=v;
    }

    public Key max(){
        int maxIndex=0;
        for(int i=1;i<N;i++){
            if(less(maxIndex,i))
                maxIndex=i;
        }
        return pq[maxIndex];
    }

    public Key delMax(){
        int maxIndex=0;
        for(int i=1;i<N;i++){
            if(less(maxIndex,i))
                maxIndex=i;
        }
        exch(maxIndex,N-1);
        Key max=pq[--N];
        pq[N]=null;
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
    
}