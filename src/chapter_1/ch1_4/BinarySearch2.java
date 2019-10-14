package chapter_1.ch1_4;

import edu.princeton.cs.algs4.StdOut;

/**
 * BinarySearch2
 */
public class BinarySearch2 {
    public static int rank(int key, int[] a){
        int lo=0;
        int hi=a.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(key<a[mid])
                hi=mid-1;
            else if(key>a[mid])
                lo=mid+1;
            else{
                if(lo==hi)
                    return mid;
                else
                    hi=mid;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] a={1,2,3,3,3,4,4,5,6,6,7};
        StdOut.println(rank(3,a));
    }
}