package chapter_1.ch1_3;

import java.util.Iterator;

/**
 * RandomBag
 */
public class RandomBag<Item> implements Iterable<Item>{
    private Item[] a=(Item[])new Object[1];
    private int N=0;
    private void resize(int max){
        Item[] tmp=(Item[])new Object[max];
        for(int i=0;i<N;i++)
            tmp[i]=a[i];
        a=tmp;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size(){
        return N;
    }

    public void add(Item item){
        if(N==a.length)
            resize(2*a.length);
        a[N++]=item;
    }
    
    @Override
    public Iterator<Item> iterator(){
        return new RandomBagIterator();
    }

    private class RandomBagIterator implements Iterator<Item>{
        public RandomBagIterator(){
            shuffle(a);
        }

        private void shuffle(Item b[]){     //洗牌算法
            int n=b.length;
            for(int i=0;i<n;i++){
                int r=i+(int)(Math.random()*(n-i));
                Item tmp=b[i];
                b[i]=b[r];
                b[r]=tmp;
            }
        }

        @Override
        public boolean hasNext(){
            return N!=0;
        }

        @Override
        public Item next(){
            return a[--N];
        }

        @Override
        public void remove(){}
    }
}