package chapter_1.ch1_3;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

/**
 * RandomQueue
 */
public class RandomQueue<Item> implements Iterable<Item>{
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

    public void enqueue(Item item){
        if(N==a.length)
            resize(2*a.length);
        a[N++]=item;
    }

    public Item dequeue(){
        int n=StdRandom.uniform(N);     //随机选取一个值
        Item item=a[n];
        a[n]=a[--N];        //数组末尾元素填补删除的元素
        if(N>0&&N==a.length/4)
            resize(a.length/2);
        return item;
    }

    public Item sample(){
        int n=StdRandom.uniform(N);
        return a[n];
    }

    @Override
    public Iterator<Item> iterator(){
        return new RandomQueueIterator();
    }

    private class RandomQueueIterator implements Iterator<Item>{
        private int i=N;
        
        @Override
        public boolean hasNext(){
            return i>0;
        }

        @Override
        public Item next(){
            int n=StdRandom.uniform(i);
            Item item=a[n];
            a[n]=a[--i];
            return item;
        }

        @Override
        public void remove(){}
    }

    public static void main(String[] args) {
        RandomQueue<Integer> queue=new RandomQueue<Integer>();
        for(int i=0;i<14;i++)
            queue.enqueue(i);
        for (Object object:queue)
            StdOut.println(object);
    }
    
}