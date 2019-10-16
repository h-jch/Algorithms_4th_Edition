package chapter_1.ch1_2;

import edu.princeton.cs.algs4.In;

/**
 * EX1_2_15
 */
public class EX1_2_15 {

    public static int[] readInts(String name){
        In in=new In(name);
        String input=in.readAll();
        String[] words=input.split("\\s+");
        int[] ints=new int[words.length];
        for(int i=0;i<words.length;i++)
            ints[i]=Integer.parseInt(words[i]);
        return ints;
    }
}