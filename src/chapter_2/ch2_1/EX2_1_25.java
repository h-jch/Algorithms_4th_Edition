package chapter_2.ch2_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * EX2_1_25
 */
public class EX2_1_25 {
    public static void sort(Comparable[] a){
        int N=a.length;
        int j;
        for(int i=1;i<N;i++){
            int tmp=a[i];
            for(j=i;j>0&&less(a[j],a[j-1]);j--){
                a[j]=a[j-1];
            }
            a[j-1]=tmp;
        }
    }
    
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }

    /*
    private static void exch(Comparable[] a, int i, int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    */

    public static void show(Comparable[] a){
        for(int i=0;i<a.length;i++)
            StdOut.print(a[i]+" ");
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a){
        for(int i=0;i<a.length;i++)
            if(less(a[i],a[i-1]))
                return false;
        return true;
    }

    public static void main(String[] args) {
        SortCompare.main("EX2_1_25 Insertion 10000 100".split(" "));
    }
}