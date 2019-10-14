package chapter_1.ch1_3;

/**
 * List
 */
public class List<Item extends Comparable<Item>> {
    private Node first;
    private int N;
    private class Node{
        Item item;
        Node next;
    }

    /**
     * EX1.3.19
     */
    public void deleteLastNode(){
        Node t=first;
        while(t.next.next!=null)
            t=t.next;
        t.next=null;
        N--;
    }
    
    /**
     * EX1.3.20
     */
    public void delete(int k){
        if(k<N)
            return;
        if(k==1){
            first=first.next;
            N--;
            return;
        }
        Node t=first;
        k=k-1;
        while(k-->0){
            t=t.next;
        }
        t.next=t.next.next;
        N--;
    }

    /**
     * EX1.3.21
     */
    public boolean find(String key){
        Node t=first;
        while(t!=null){
            if(t.item==key)
                return true;
            t=t.next;
        }
        return false;
    }

    /**
     * EX1.3.24
     */
    public void removeAfter(Node t){
        if(t==null||t.next==null)
            return;
        t.next=t.next.next;
    }

    /**
     * EX1.3.25
     */
    public void insertAfter(Node p, Node t){
        if(p==null||t==null)
            return;
        t.next=p.next;
        p.next=t;
    }

    /**
     * EX1.3.26
     */
    public void remove(String key){
        while(first.item==key){     //处理头结点
            first=first.next;
        }

        Node t=first;
        
        while(t.next!=null){
            if(t.next.item==key){
                t.next=t.next.next;
            }
            t=t.next;
        }
    }

    /**
     * EX1.3.27
     */
    public Item max(){
        if(first==null)
            return null;
        Item max=first.item;
        for(Node t=first;t!=null;t=t.next){
            if(max.compareTo(t.item)<0){
                max=t.item;
            }
        }
        return max;
    }

    /**
     * EX1.3.28
     */
    public Item max_recursion(Node first){
        if(N==1)
            return first.item;
        Item max=max_recursion(first.next);
        return first.item.compareTo(max)>0?first.item:max;
    }
}