package chapter_1.ch1_1;

import java.math.BigInteger;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_1_19
 */
public class EX1_1_19 {

    public static void main(String[] args) {
        for(int N=0;N<100;N++)
            StdOut.println(N+" "+F(N));
    }

    public static long F(int N){
        long ans=0;
        long n1=0;
        long n2=1;
        while(N-->0){
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
        return ans;
    }
}