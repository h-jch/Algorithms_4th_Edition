package chapter_2.ch2_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * Shell
 */
public class Shell {
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }

    private static void exch(Comparable[] a ,int i, int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }

    private static void show(Comparable[] a){
        for(int i=0;i<a.length;i++)
            StdOut.println(a[i]+" ");
        StdOut.println();
    }

    public static void sort(Comparable[] a){
        int N=a.length;
        int h=1;
        while(h<N/3)
            h=3*h+1;
        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h)
                    exch(a,j,j-h);
            }
            h=h/3;
        }
    }

    public static void sort2(Comparable[] a){
        int N=a.length;
        int[] h=new int[N];
        int t=1;
        h[0]=1;
        while(h[t]<N/3){
            h[t]=3*h[t-1]+1;
            t++;
        }

        while(t>=0){
            for(int i=h[t];i<N;i++){
                for(int j=i;j>=h[t]&&less(a[j],a[j-h[t]]);j-=h[t])
                    exch(a,j,j-h[t]);
            }
            t--;
        }
    }
    
    public static boolean isSorted(Comparable[] a){
        for(int i=1;i<a.length;i++)
            if(less(a[i],a[i-1]))
                return false;
        return true;
    }

    public static void main(String[] args) {
        String[] a=In.readStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}