package chapter_2.ch2_1;

/**
 * EX2_2_16
 */
public class EX2_2_16 {
    public static boolean check(Comparable[] a){
        int N=a.length;
        Comparable[] b=new Comparable[N];
        for(int i=0;i<N;i++)
            b[i]=a[i];
        Arrays.sort(a);
        for(int i=0;i<N;i++){
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }
    
}