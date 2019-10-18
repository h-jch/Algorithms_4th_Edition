package chapter_2.ch2_1;

/**
 * InsertionSort
 */
public class EX2_1_26 {
    public static void sort(int[] a){
        int N=a.length;
        for(int i=1;i<N;i++){
            int j=i;
            int tmp=a[j];
            for(;j>0&&tmp<a[j-1];j--){
                a[j]=a[j-1];
            }
            a[j-1]=tmp;
        }
    }

    public static void sort1(int[] a){
        int N=a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0&&a[j]<a[j-1];j--){
                int t=a[j];
                a[j]=a[j-1];
                a[j-1]=t;
            }
        }
    }
}
