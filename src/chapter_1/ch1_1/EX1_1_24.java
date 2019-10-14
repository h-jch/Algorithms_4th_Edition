package chapter_1.ch1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_1_24
 */
public class EX1_1_24 {

    public static void main(String[] args) {
        int x=gcd(105,24);
        StdOut.println(x);
    }

    public static int gcd(int p, int q){
        StdOut.println("p="+p+", q="+q);
        if(q==0)
            return p;
        int r=p%q;
        return gcd(q,r);
    }
}