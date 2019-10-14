package chapter_3.ch3_5;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * SET
 */
public class SET<Key extends Comparable<Key>> implements Iterable<Key>{
    private TreeSet<Key> set;

    public SET(){
        set=new TreeSet<Key>();
    }

    public boolean isEmpty(){
        return set.isEmpty();
    }

    public boolean contains(Key key){
        return set.contains(key);
    }

    public void add(Key key){
        set.add(key);
    }

    public void delete(Key key){
        set.remove(key);
    }
    
    public int size(){
        return set.size();
    }

    @Override
    public Iterator<Key> iterator(){
        return set.iterator();
    }

    @Override
    public String toString(){
        return set.toString();
    }
}