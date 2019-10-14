package chapter_2.ch2_4;

/**
 * EX2_4_15
 */
public class EX2_4_15<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;

    public boolean isMinPQ(){
        for(int i=1;i<=N/2;i++){
            if(less(2*i,i)||less(2*i+1,i))
                return false;
        }
        return true;
    }

    private boolean less(int i, int j){
        return pq[i].compareTo(pq[j])<0;
    }
    
}