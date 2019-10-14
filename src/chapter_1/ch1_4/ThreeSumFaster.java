package chapter_1.ch1_4;

/**
 * ThreeSumFaster
 */
public class ThreeSumFaster {
    public static int count(int[] a){
        int N=a.length;
        int cnt=0;
        for(int i=0;i<N;i++)
            for(int j=i+1,k=N-1;j<k;){
                if(a[i]+a[j]+a[k]>0)
                    k--;
                else if(a[i]+a[j]+a[k]<0)
                    j++;
                else{
                    cnt++;
                    k--;
                    j++;
                }
            }
        return cnt;
    }
    
}