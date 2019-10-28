package chapter_3.ch3_5;

import java.util.Iterator;
import edu.princeton.cs.algs4.LinearProbingHashST;

/**
 * HashSET
 */
public class HashSET<Key> implements Iterable<Key>{
    private LinearProbingHashST<Key,Character> set;

    public HashSET(){
        set=new LinearProbingHashST<>();
    }
    
    public boolean isEmpty(){
        return set.isEmpty();
    }

    public boolean contains(Key key){
        return set.contains(key);
    }
    
    public void add(Key key){
        set.put(key,null);
    }

    public void delete(Key key){
        set.delete(key);
    }

    public int size(){
        return set.size();
    }

    @Override
    public Iterator<Key> iterator(){
        return (Iterator<Key>) set.keys();
    }

    @Override
    public String toString(){
        return set.toString();
    }
}