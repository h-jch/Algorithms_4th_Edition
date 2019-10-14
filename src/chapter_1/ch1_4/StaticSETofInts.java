package chapter_1.ch1_4;

import java.util.Arrays;

/**
 * StaticSETofInts
 */
public class StaticSETofInts {
    private int[] a;

    public StaticSETofInts(int[] keys){
        a=new int[keys.length];
        for(int i=0;i<keys.length;i++)
            a[i]=keys[i];
        Arrays.sort(a);
    }
    
    public boolean contains(int key){
        return rank(key)!=-1;
    }

    private int rank(int key){
        int lo=0;
        int hi=a.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(key<a[mid])
                hi=mid-1;
            else if(key>a[mid])
                lo=mid+1;
            else{
                if(lo==hi)
                    return mid;
                else
                    hi=mid;
            }
        }
        return -1;
    }

    public int howMany(int key){
        int index=rank(key);
        if(index==-1)
            return 0;
        
        int cnt=0;
        while(a[index]==key){
            cnt++;
            index++;
            if(index>=a.length)
                break;
        }
        return cnt;
    }
}