package chapter_1.ch1_4;

import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_4_12
 */
public class EX1_4_12 {

    public static void main(String[] args) {
        int[] a={1,2,3,5,7,10,23};
        int[] b={1,4,6,7,9,10,22,23,30};
        int i=0;
        int j=0;
        while(i<a.length&&j<b.length){
            if(a[i]<b[j])
                i++;
            else if(a[i]>b[j])
                j++;
            else{
                StdOut.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }
}