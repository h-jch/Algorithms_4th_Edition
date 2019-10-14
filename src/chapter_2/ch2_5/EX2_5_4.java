package chapter_2.ch2_5;

import java.util.Arrays;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX2_5_4
 */
public class EX2_5_4 {
    public static String[] dedup(String[] a){     //返回一个有序的a[]，并删去重复元素
        Arrays.sort(a);
        int cnt=1;
        for(int i=1;i<a.length;i++){
            if(!a[i].equals(a[i-1]))
                cnt++;
        }
        String[] b=new String[cnt];
        b[0]=a[0];
        int j=1;
        for(int i=1;i<a.length;i++){
            if(a[i].equals(a[i-1]))
                continue;
            b[j++]=a[i];
        }
        return b;
    }
    
    public static void main(String[] args) {
        String[] a={"one","one","two","three","two","two","three","four","five","six","six"};
        String[] b=dedup(a);
        for(String s:b)
            StdOut.print(s+" ");
    }
}