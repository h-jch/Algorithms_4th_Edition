package chapter_1.ch1_2;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a, int[] counter){
        int lo=0;
        int hi=a.length-1;
        int i=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            counter[i++]=a[mid];
            if(key<a[mid])
                hi=mid-1;
            else if(key>a[mid])
                lo=mid+1;
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist= In.readInts(args[0]);
        Arrays.sort(whitelist);
        int[] Counter=new int[whitelist.length];
        while(!StdIn.isEmpty()){
            int key=StdIn.readInt();
            if(rank(key,whitelist,Counter)<0)
                StdOut.println(key);
            for(int c:Counter)
                StdOut.print(c+" ");
        }
    }
}
