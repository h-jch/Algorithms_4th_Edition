package chapter_1.ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
/**
 * EX1_1_3
 */
public class EX1_1_3 {

    public static void main(String[] args) {
        int a,b,c;
        StdOut.println("Please enter three numbers:");
        a=StdIn.readInt();
        b=StdIn.readInt();
        c=StdIn.readInt();
        if(a==b&&a==c)
            StdOut.println("equal");
        else
            StdOut.println("not equal");
    }
}