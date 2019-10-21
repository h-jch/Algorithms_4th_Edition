package chapter_2.ch2_2;

public class EX2_2_14 {
    public static int[] merge(int[] a, int[] b){
        int len1=a.length, len2=b.length;
        int[] res=new int[len1+len2];
        int i=0, j=0;
        for(int k=0;k<res.length;k++){
            if(i>=len1)
                res[k]=b[j++];
            else if(j>=len2)
                res[k]=a[i++];
            else if(a[i]<b[j])
                res[k]=a[i++];
            else
                res[k]=b[j++];
        }
        return res;
    }
}
