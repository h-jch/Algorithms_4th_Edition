package chapter_1.ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_1_15
 */
public class EX1_1_15 {

    public static void main(String[] args) {
        int []n={1,1,2,3,2,1,5,7,4,3};
        int []r=histogram(n, 10);
        for(int i:r)
            StdOut.printf("%d ",i);
    }

    public static int[] histogram(int []a, int M){
        int[] n=new int[M];
        for(int i=0;i<a.length;i++){
            if(a[i]<M)
                n[a[i]]++;
        }
        return n;
    }
}