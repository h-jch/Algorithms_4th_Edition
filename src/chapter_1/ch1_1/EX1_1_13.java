package chapter_1.ch1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_1_13
 */
public class EX1_1_13 {

    public static void main(String[] args) {
        int[][] n={{1,2,4},{3,2,4},{5,3,9},{9,2,6}};
        for(int i=0;i<n[0].length;i++){
            for(int j=0;j<n.length;j++)
                StdOut.printf("%d ",n[j][i]);
            StdOut.println();
        }
    }
}