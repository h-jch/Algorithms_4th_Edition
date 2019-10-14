package chapter_1.ch1_4;

/**
 * TwoSumFaster
 */
public class TwoSumFaster {
    public static int count(int[] a){
        int i=0;
        int j=a.length-1;
        int cnt=0;
        while(i>j){
            if(a[i]+a[j]>0)
                j--;
            else if(a[i]+a[j]<0)
                i++;
            else{
                cnt++;
                i++;
                j--;
            }
        }
        return cnt;
    }
    
}