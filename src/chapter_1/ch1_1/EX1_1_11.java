package chapter_1.ch1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_1_11
 */
public class EX1_1_11 {

    public static void main(String[] args) {
        boolean[][] n={{true,true,true,false},{false,true,true,false},{false,true,false,false},{true,false,true,true}};
        StdOut.println("  1 2 3 4");
        for(int i=0;i<n.length;i++){
            StdOut.print(i+1);
            for(int j=0;j<n[i].length;j++){
                char c;
                if(n[i][j])
                    c='*';
                else
                    c=' ';
                StdOut.printf(" %c",c);
            }
            StdOut.println();
        }
    }
}