package chapter_1.ch1_3;

/**
 * GeneralizedQueue
 */
public class GeneralizedQueue<Item> {
    private Item[] a=(Item[])new Object[1];
    private int N=0;
    private void resize(int max){
        Item tmp[]=(Item[])new Object[max];
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

    public void insert(Item item){
        if(N==a.length)
            resize(2*a.length);
        a[N++]=item;
    }

    public Item delete(int k){
        Item item=a[k];
        for(int i=k;i<N-1;i++)
            a[i]=a[i+1];
        a[N-1]=null;
        N--;
        return item;
    }
}