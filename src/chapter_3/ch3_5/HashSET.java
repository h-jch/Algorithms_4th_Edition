package chapter_3.ch3_5;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSET
 */
public class HashSET<Key> implements Iterable<Key>{
    private HashSet<Key> set;

    public HashSET(){
        set=new HashSet<Key>();
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