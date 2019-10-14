package chapter_1.ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_1_21
 */
public class EX1_1_21 {

    public static void main(String[] args) {
        StdOut.println("number of students: ");
        int n=StdIn.readInt();
        String[] name=new String[n];
        int[] x=new int[n];
        int[] y=new int[n];
        
        for(int i=0;i<n;i++){
            name[i]=StdIn.readString();
            x[i]=StdIn.readInt();
            y[i]=StdIn.readInt();
        }

        StdOut.println("Name\tx\ty\tx/y");
        for(int i=0;i<n;i++){
            StdOut.printf("%s\t%d\t%d\t%.3f\n",name[i],x[i],y[i],(double)x[i]/y[i]);
        }
    }
}