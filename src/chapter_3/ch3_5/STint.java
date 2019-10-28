package chapter_3.ch3_5;

import edu.princeton.cs.algs4.RedBlackBST;

import java.util.Iterator;

public class STint<Value> implements Iterable<Integer>{
    private RedBlackBST<Integer,Value> set;

    public STint(){
        set=new RedBlackBST<>();
    }

    public boolean isEmpty(){
        return set.isEmpty();
    }

    public boolean contains(int key){
        return set.contains(key);
    }

    public void add(int key, Value value){
        set.put(key,value);
    }

    public void delete(int key){
        set.delete(key);
    }

    public int size(){
        return set.size();
    }

    public Iterator<Integer> iterator(){
        return (Iterator<Integer>) set.keys();
    }

    public String toString(){
        return set.toString();
    }
}
