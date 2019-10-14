package chapter_2.ch2_2;

/**
 * EX2_2_11
 */
public class EX2_2_11 {
    private static int CUTOFF=15;

    public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
        int i=lo;
        int j=mid+1;
/*
        for(int k=lo;k<=hi;k++)
            aux[k]=a[k];
*/        
        for(int k=lo;k<=hi;k++){
            if(i>mid)
                a[k]=aux[j++];
            else if(j>hi)
                a[k]=aux[i++];
            else if(less(a[j],a[i]))
                a[k]=a[j++];
            else
                a[k]=a[i++];
        }
    }

    public static void sort(Comparable[] a){
        Comparable[] aux=a.clone();     //避免数组复制
        sort(a,aux,0,a.length-1);
    }

    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi){
        if(hi-lo<CUTOFF){       //小数组，用插入排序加快速度
            insertionsort(a,lo,hi);
            return;
        }
            
        int mid=lo+(hi-lo)/2;
        sort(a,aux,lo,mid);
        sort(a,aux,mid+1,hi);
        if(less(a[mid+1],a[mid]))       //a[mid+1]<a[mid]，进行merge，否则，数组已经有序
            merge(a,aux,lo,mid,hi);
    }

    private static void insertionsort(Comparable[] a, int lo, int hi){
        for(int i=lo+1;i<=hi;i++){
            for(int j=i;j>lo&&less(a[j],a[j-1]);j--)
                exch(a,j,j-1);
        }
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