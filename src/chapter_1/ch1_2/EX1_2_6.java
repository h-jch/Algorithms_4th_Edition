package chapter_1.ch1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_2_6
 */
public class EX1_2_6 {

    public static void main(String[] args) {
        String s=StdIn.readString();
        String t=StdIn.readString();
        if(s.length()==t.length()&&s.concat(s).indexOf(t)>=0)
            StdOut.println(s+" is the circular rotation of "+t);
        else
            StdOut.println(s+" is not the circular rotation of "+t);
    }
}