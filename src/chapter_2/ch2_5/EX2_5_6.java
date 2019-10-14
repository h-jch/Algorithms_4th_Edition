package chapter_2.ch2_5;

/**
 * EX2_5_6
 */
public class EX2_5_6 {
    public static Comparable select(Comparable[] a, int k){
        StdRandom.shuffle(a);
        int lo=0, hi=a.length-1;
        while(hi>lo){
            int j=partition(a,lo,hi);
            if(j==k)
                return a[k];
            else if(j>k)
                hi=j-1;
            else if(j<k)
                lo=j+1;
        }
        return a[k];
    }
    
    public static Comparable select_recursion(Comparable[] a, int lo, int hi, int k){
        int j=partition(a, lo, hi);
        if(j==k)
            return a[k];
        else if(j>k)
            select_recursion(a, lo, j-1, k);
        else if(j<k)
            select_recursion(a, j+1, hi, k);
        return a[k];
    }

    private static int partition(Comparable[] a, int lo, int hi){
        int i=lo, j=hi+1;
        Comparable v=a[lo];
        while(true){
            while(less(a[++i],v))
                if(i==hi)
                    break;
            while(less(v,a[--j]))
                if(j==lo)
                    break;
            if(i>=j)
                break;
            exch(a,i,j);
        }
        exch(a,lo,j);
        return j;
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }

    private static void exch(Comparable[] a, int i, int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}