package chapter_1.ch1_4;

/**
 * EX1_4_18
 */
public class EX1_4_18 {
    public static int partialMin(int[] a){
        int N=a.length;
        int lo=0;
        int hi=N;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(a[mid]<a[mid+1]&&a[mid]>a[mid-1])
                return mid;
            else{
                if(a[mid-1]>a[mid+1])
                    lo=mid+1;
                else
                    hi=mid-1;
            }
        }
        return -1;
    }
    
}