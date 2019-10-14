package chapter_3.ch3_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * TestBST
 */
public class TestBST {
    
    public static void main(String[] args) {
        BST<String,Integer> bst=new BST<>();
        for(int i=0;!StdIn.isEmpty();i++){
            String key=StdIn.readString();
            bst.put(key, i);
        }
        for(String s:bst.keys()){
            StdOut.println(s+" "+bst.get(s));
        }

        StdOut.println("min(): "+bst.min());
        StdOut.println("max(): "+bst.max());
        StdOut.println("floor(\"F\"): "+bst.floor("F"));
        StdOut.println("ceiling(\"C\"): "+bst.ceiling("C"));
        StdOut.println("select(1): "+bst.select(1));
        StdOut.println("rank(\"R\"): "+bst.rank("R"));
        StdOut.println("delete(\"D\"): ");
        bst.delete("D");
        for(String s:bst.keys()){
            StdOut.println(s+" "+bst.get(s));
        }

        StdOut.println("delelteMin(): ");
        bst.deleteMin();
        for(String s:bst.keys()){
            StdOut.println(s+" "+bst.get(s));
        }

        StdOut.println("deleteMax(): ");
        bst.deleteMax();
        for(String s:bst.keys()){
            StdOut.println(s+" "+bst.get(s));
        }
    }
}