package chapter_1.ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_1_14
 */
public class EX1_1_14 {

    public static void main(String[] args) {
        int n=StdIn.readInt();
        StdOut.println(lg(n));    
    }

    public static int lg(int N){
        int ans=0;
        int mul=1;
        while(mul<=N){
            mul*=2;
            ans++;
        }
        return ans-1;
    }
}