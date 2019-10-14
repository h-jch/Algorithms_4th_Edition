package chapter_1.ch1_2;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdDraw;

/**
 * VisualCounter
 */
public class VisualCounter {
    private int max;
    private int count;
    private int N;
    private int n;

    public VisualCounter(int N, int max){
        this.N=N;
        this.max=max;
        this.count=0;
        this.n=0;
        StdDraw.setXscale(0, N);
		StdDraw.setYscale(-max, max);
		StdDraw.setPenRadius(0.01);
		StdDraw.point(0, 0);
    }

    public void increment(){
        if(n+1>N){
            StdOut.println("operate too much!");
            return;
        }
        if(count+1>max){
            StdOut.println("count exceeds the max!");
            return;
        }
        count++;
        n++;
        StdDraw.point(n,count);
    }

    public void decrement(){
        if(n+1>N){
            StdOut.println("operate too much!");
            return;
        }
        if(count-1<-max){
            StdOut.println("count exceed the min!");
            return;
        }
        count--;
        n++;
        StdDraw.point(n,count);
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        VisualCounter counter=new VisualCounter(20, 5);
        for(int i=0;i<10;i++){
            counter.increment();
        }
        for(int i=0;i<15;i++){
            counter.decrement();
        }
        for(int i=0;i<10;i++){
            counter.increment();
        }
        StdOut.println("count: "+counter.getCount());
    }
}