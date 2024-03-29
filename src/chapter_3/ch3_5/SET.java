package chapter_3.ch3_5;

import edu.princeton.cs.algs4.RedBlackBST;
import java.util.Iterator;

/**
 * SET
 */
public class SET<Key extends Comparable<Key>> implements Iterable<Key>{
    private RedBlackBST<Key, Character> set;

    public SET(){
        set=new RedBlackBST<>();
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