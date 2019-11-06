package chapter_3.ch3_5;

import edu.princeton.cs.algs4.RedBlackBST;

import java.util.Iterator;

public class STdouble<Value> implements Iterable<Double>{
    private RedBlackBST<Double,Value> set;

    public STdouble(){
        set=new RedBlackBST<>();
    }

    public boolean isEmpty(){
        return set.isEmpty();
    }

    public boolean contains(double key){
        return set.contains(key);
    }

    public void add(double key, Value value){
        set.put(key,value);
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
