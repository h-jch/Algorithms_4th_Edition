package chapter_1.ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_1_9
 */
public class EX1_1_9 {

    public static void main(String[] args) {
        String s="";
        int N=StdIn.readInt();
        for(int n=N;n>0;n/=2)
            s+=n%2;
        StdOut.println(s);
    }
}