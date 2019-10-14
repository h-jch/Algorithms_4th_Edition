package chapter_1.ch1_4;

import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_4_17
 */
public class EX1_4_17 {
    public static void farthestPair(double[] a){
        int N=a.length;
        double min=Double.MAX_VALUE;
        double max=Double.MIN_VALUE;
        for(int i=0;i<N;i++){       //N
            if(a[i]>=max)
                max=a[i];
            if(a[i]<=min)
                min=a[i];
        }
        StdOut.println("The farthest pair are "+min+" and "+max);
    }
    
}