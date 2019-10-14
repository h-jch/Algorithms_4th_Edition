package chapter_1.ch1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Interval1D;

/**
 * EX1_2_2
 */
public class EX1_2_2 {

    public static void main(String[] args) {
        int N=StdIn.readInt();
        Interval1D[] interval=new Interval1D[N];
        for(int i=0;i<N;i++){
            double x=StdIn.readDouble();
            double y=StdIn.readDouble();
            interval[i]=new Interval1D(x,y);
        }

        if(N>2){
            for(int i=0;i<N-1;i++){
                for(int j=i+1;j<N;j++){
                    if(interval[i].intersects(interval[j])){
                        StdOut.println(interval[i]+" intersects "+interval[j]);
                    }
                }
            }
        }
    }
}