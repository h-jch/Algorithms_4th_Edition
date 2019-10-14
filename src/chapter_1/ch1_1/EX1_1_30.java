package chapter_1.ch1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX1_1_30
 */
public class EX1_1_30 {

    public static void main(String[] args) {
        int N=StdIn.readInt();
        boolean[][] a=new boolean[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(gcd(i,j)==1)
                    a[i][j]=true;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)
                StdOut.printf("%b ",a[i][j]);
            StdOut.println();
        }
    }

    public static int gcd(int p, int q){
        if(q==0)
            return p;
        int r=p%q;
        return gcd(q,r);
    }
}