package chapter_3.ch3_5;

/**
 * BinarySearchSET
 */
public class BinarySearchSET<Key extends Comparable<Key>> {
    private Key[] keys;
    private int N;

    public BinarySearchSET(int capacity){
        keys=(Key[])new Object[capacity];
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return N==0;
    }
    
    public boolean contains(Key key){
        return key.equals(keys[rank(key)]);
    }

    private int rank(Key key){
        int lo=0, hi=N-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int cmp=key.compareTo(keys[mid]);
            if(cmp<0)
                hi=mid-1;
            else if(cmp>0)
                lo=mid+1;
            else
                return mid;
        }
        return lo;
    }

    public void add(Key key){
        int i=rank(key);
        if(i<N&&keys[i].compareTo(key)==0)
            return;
        for(int j=N;j>i;j--)
            keys[j]=keys[j-1];
        keys[i]=key;
        N++;
    }

    public void delete(Key key){
        int i=rank(key);
        if(i<N&&keys[i].compareTo(key)!=0)
            return;
        for(int j=i;j<N-1;j++)
            keys[j]=keys[j+1];
        keys[N-1]=null;
        N--;
    }

    @Override
    public String toString(){
        String s="";
        for(int i=0;i<N;i++)
            s+=keys[i]+" ";
        return s;
    }
}