package chapter_1.ch1_4;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * ThreeSum2
 */
public class ThreeSum2 {
    public static int count(long[] a){
        int N=a.length;
        int cnt=0;
        for(int i=0;i<N;i++)
            for(int j=i+1;j<N;j++)
                for(int k=j+1;k<N;k++)
                    if(a[i]+a[j]+a[k]==0)
                        cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        int[] b=In.readInts(args[0]);
        long[] a=new long[b.length];
        for(int i=0;i<a.length;i++)
            a[i]=b[i];
        StdOut.println(count(a));
    }
    
}