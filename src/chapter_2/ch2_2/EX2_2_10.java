package chapter_2.ch2_2;

/**
 * EX2_2_10
 */
public class EX2_2_10 {
    private static Comparable[] aux;

    public static void merge(Comparable[] a, int lo, int mid, int hi){
        int i=lo;
        int j=hi;
        
        for(int k=lo;k<=mid;k++)
            aux[k]=a[k];
        for(int k=mid+1;k<=hi;k++)
            aux[k]=a[hi+mid+1-k];
        
        for(int k=lo;k<=hi;k++){
            if(less(aux[j],aux[i]))
                a[k]=aux[j--];
            else
                a[k]=aux[i++];
        }
    }

    public static void sort(Comparable[] a){
        aux=new Comparable[a.length];
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi){
        if(hi<=lo)
            return;
        int mid=lo+(hi-lo)/2;
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        merge(a, lo, mid, hi);
    }

    private static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }
    
}