package chapter_1.ch1_4;

import java.util.Arrays;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_4_16
 */
public class EX1_4_16 {
    public static void closestPair(double[] a){
        int N=a.length;
        Arrays.sort(a);     //NlgN
        double minNum=Double.MAX_VALUE;
        int minIndex=0;
        for(int i=0;i<N-1;i++){     //N
            if(a[i+1]-a[i]<minNum){
                minIndex=i;
                minNum=a[i+1]-a[i];
            }
        }
        StdOut.println("The closest pair are "+a[minIndex]+" and "+a[minIndex+1]);
    }
    
}