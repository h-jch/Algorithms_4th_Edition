package chapter_1.ch1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Point2D;

/**
 * EX1_2_1
 */
public class EX1_2_1 {

    public static void main(String[] args) {
        int N=StdIn.readInt();
        Point2D[] p=new Point2D[N];
        for(int i=0;i<N;i++){
            double x=Math.random();
            double y=Math.random();
            p[i]=new Point2D(x,y);
            p[i].draw();
        }

        if(N>1){
            double min=p[0].distanceTo(p[1]);
            for(int i=0;i<N-1;i++){
                for(int j=i+1;j<N;j++){
                    if(p[i].distanceTo(p[j])<min){
                        min=p[i].distanceTo(p[j]);
                    }
                }
            }
            StdOut.println("Min distance: "+min);
        }
    }
}