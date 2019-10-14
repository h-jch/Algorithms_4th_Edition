package chapter_3.ch3_1;

import chapter_2.ch2_2.Merge;

/**
 * BinarySearchST_Item
 */
public class BinarySearchST_Item<Key extends Comparable<Key>, Value>{
    private Item[] items;
    private int N;
    private class Item<Key extends Comparable<Key>, Value> implements Comparable<Item>{
        Key key;
        Value val;

        @Override
        public int compareTo(Item that) {
            if(less(this.key, that.key))
                return -1;
            else if(less(that.key, this.key))
                return 1;
            else
                return 0;
        }

        private boolean less(Comparable v, Comparable w){
            return v.compareTo(w)<0;
        }
    }

    public BinarySearchST_Item(int cap){
        items=(Item[])new Object[cap];
        N=0;
    }

    public void BinarySearchST(Item[] a){
        items=a;
        N=a.length;
        Merge.sort(items);
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public Value get(Key key){
        if(isEmpty())
            return null;
        int i=rank(key);
        if(i<N&&items[i].key.compareTo(key)==0)
            return (Value) items[i].val;
        else
            return null;
    }
    
    public int rank(Key key){
        int lo=0, hi=N-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int cmp=items[mid].key.compareTo(key);
            if(cmp>0)
                hi=mid-1;
            else if(cmp<0)
                lo=mid+1;
            else
                return mid;
        }
        return lo;
    }

    public void put(Key key, Value val){
        int i=rank(key);
        if(i<N&&items[i].key.compareTo(key)==0){
            items[i].val=val;
            return;
        }
        for(int j=N;j>i;j--){
            items[j]=items[j-1];
        }
        items[i].key=key;
        items[i].val=val;
        N++;
    }
}