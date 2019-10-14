package chapter_2.ch2_5;

import java.util.List;
import java.util.ArrayList;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * EX2_5_2
 */
public class EX2_5_2 {
    public static List<String> CombinationWords(String[] strings){
        List<String> l=new ArrayList<String>();
        int N=strings.length;
        for(int i=0;i<N;i++){
            String stringFirst=strings[i];
            for(int j=i+1;j<N;j++){
                String stringSecond=strings[j];
                for(int k=0;k<N;k++){
                    if((stringFirst+stringSecond).equals(strings[k])||(stringSecond+stringFirst).equals(strings[k]))
                        l.add(strings[k]);
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        String[] strings=new String[100];
        int i=0;
        while(!StdIn.isEmpty()){
            strings[i]=StdIn.readString();
            i++;
        }
        List<String> l=CombinationWords(strings);
        for(String s:l)
            StdOut.print(s+" ");
    }
    
}