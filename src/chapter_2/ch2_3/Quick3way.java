package chapter_2.ch2_3;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Quick3way
 */
public class Quick3way {
    public static void sort(Comparable[] a){
        StdRandom.shuffle(a);
        sort(a,0,a.length-1);
    }
    
    private static void sort(Comparable[] a, int lo, int hi){
        if(hi<=lo)
            return;
        int lt=lo,i=lo+1,gt=hi;
        Comparable v=a[lo];
        while(i<=gt){
            int cmp=a[i].compareTo(v);
            if(cmp<0)
                exch(a, lt++, i++);
            else if(cmp>0)
                exch(a, i, gt--);
            else
                i++;
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);
    }
/*
    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }
*/
    private static void exch(Comparable[] a, int i, int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    
}