package chapter_1.ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_1_20
 */
public class EX1_1_20 {

    public static void main(String[] args) {
        int n=StdIn.readInt();
        StdOut.println(L(n));
    }

    public static double L(int N){
        if(N==0||N==1)
            return 0;
        return Math.log(N)+L(N-1);
    }
}