package chapter_1.ch1_3;

/**
 * ResizingArrayQueueOfStrings
 */
public class ResizingArrayQueueOfStrings {
    private String[] a=new String[1];
    private int N=0;

    private void resize(int max){
        String[] tmp=new String[max];
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

    public void enqueue(String item){
        if(N==a.length)
            resize(2*a.length);
        a[N++]=item;
    }

    public String dequeue(){
        String item=a[0];
        for(int i=0;i<N-1;i++)
            a[i]=a[i+1];
        N--;
        a[N]=null;
        if(N>0&&N==a.length/4)
            resize(a.length/2);
        return item;
    }
}