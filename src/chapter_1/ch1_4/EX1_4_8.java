package chapter_1.ch1_4;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_4_8
 */
public class EX1_4_8 {
    public static int count(int[] a){
        int N=a.length;
        int cnt=0;
        for(int i=0;i<N;i++)
            for(int j=i+1;j<N;j++)
                if(a[i]==a[j])
                    cnt++;
        return cnt;
    }
    
    public static int countFast(int[] a){
        int N=a.length;
        int cnt=0;
        Arrays.sort(a);
        for(int i=0;i<N;i++)
            if(BinarySearch.rank(a[i],a)!=i)
                cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        int[] a=In.readInts(args[0]);

    }
}