package chapter_1.ch1_3;

/**
 * FixedCapacityStackOfStrings
 */
public class FixedCapacityStackOfStrings {
    private String[] a;
    private int N;

    public FixedCapacityStackOfStrings(int cap){
        a=new String[cap];
    }

    public boolean isEmpty(){
        return N==0;
    }

    public boolean isFull(){
        return N==cap;
    }

    public int size(){
        return N;
    }

    public void push(String item){
        a[N++]=item;
    }

    public String pop(){
        return a[--N];
    }
    
}