package chapter_1.ch1_1;

import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {
    public static int rank(int key, int[] a){
        int i=0;        //time of recursion
        return rank(key, a, 0, a.length-1, i);
    }

    public static int rank(int key, int[] a, int lo, int hi, int i){
        for(int k=i;k>0;k--)
            StdOut.print(" ");
        StdOut.println(i+" "+lo+" "+hi);
        if(lo<hi)
            return -1;
        int mid=lo+(hi-lo)/2;
        if(key<a[mid])
            return rank(key, a, lo, mid+1, i+1);
        else if(key>a[mid])
            return rank(key, a, mid+1, hi, i+1);
        else
            return mid;
    }

    /**
     * Ex1.1.29
     * @param key
     * @param a
     * @return number of element that is lower than key
     */
    public static int rank(int[] a, int key){
        int lo=0, hi=a.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(key<a[mid])
                hi=mid-1;
            else if(key>a[mid])
                lo=mid+1;
            else{
                while(a[mid]==a[mid+1])
                    mid--;
                return mid+1;
            }
        }
        return lo;
    }

    /**
     * Ex1.1.29
     * @param key
     * @param a
     * @return number of element that equals to key
     */
    public static int count(int key, int[] a){
        int i=rank(a, key);
        int num=0;
        if(a[i]!=key)
            return num;
        else
            num++;
        while(a[i]==a[i+1]){
            num++;
            i++;
        }
        return num;
    }
}
