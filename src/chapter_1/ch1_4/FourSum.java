package chapter_1.ch1_4;

import java.util.Arrays;

/**
 * FourSum
 */
public class FourSum {
    public static int count(int[] a){
        int N=a.length-1;
        int cnt=0;
        Arrays.sort(a);
        for(int i=0;i<N;i++)
            for(int j=i+1;j<N;j++)
                for(int k=j+1;k<N;k++)
                    if(BinarySearch.rank(-(a[i]+a[j]+a[k]),a)>k)
                        cnt++;
        return cnt;
    }

    public static int countFast(int[] a){
        int N=a.length-1;
        int cnt=0;
        Arrays.sort(a);
        for(int i=0;i<N;i++)
            for(int j=i+1;j<N;j++)
                for(int k=j+1,l=N-1;k<l;){
                    if(a[i]+a[j]+a[k]+a[l]<0)
                        j++;
                    else if(a[i]+a[j]+a[k]+a[l]>0)
                        k--;
                    else{
                        cnt++;
                        j++;
                        k--;
                    }
                }
        return cnt;
    }
    
}