package chapter_1.ch1_4;

public class EX1_4_20 {
    public static int bitonicSearch(int[] a, int key){
        int localMax=localMaxmum(a);
        if(a[localMax]<key)
            return -1;
        else if(a[localMax]>key){
            int lo1=0,hi1=localMax-1,lo2=localMax+1,hi2=a.length-1;
            while (lo1<=hi1){
                int mid=lo1+(hi1-lo1)/2;
                if(a[mid]<key)
                    lo1=mid+1;
                else if(a[mid]>key)
                    hi1=mid-1;
                else
                    return mid;
            }
            while (lo2<=hi2){
                int mid=lo2+(hi2-lo2)/2;
                if(a[mid]<key)
                    hi2=mid-1;
                else if(a[mid]>key)
                    lo2=mid+1;
                else
                    return mid;
            }
            return -1;
        }
        else
            return localMax;
    }

    private static int localMaxmum(int[] a){
        int lo=0, hi=a.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(a[mid]>a[mid-1])
                lo=mid+1;
            else if(a[mid]>a[mid+1])
                hi=mid-1;
            else
                return mid;
        }
        return lo;
    }
}
