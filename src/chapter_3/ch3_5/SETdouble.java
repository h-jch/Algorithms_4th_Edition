package chapter_3.ch3_5;

import edu.princeton.cs.algs4.RedBlackBST;

import java.util.Iterator;

public class SETdouble implements Iterable<Double>{
    private RedBlackBST<Double,Character> set;

    public SETdouble(){
        set=new RedBlackBST<>();
    }

    public boolean isEmpty(){
        return set.isEmpty();
    }

    public boolean contains(double key){
        return set.contains(key);
    }

    public void add(double key){
        set.put(key,null);
    }

    public void delete(double key){
        set.delete(key);
    }

    public int size(){
        return set.size();
    }

    public Iterator<Double> iterator(){
        return (Iterator<Double>) set.keys();
    }

    public String toString(){
        return set.toString();
    }
}
