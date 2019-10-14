package chapter_1.ch1_3;

/**
 * EX1_3_30
 */
public class EX1_3_30 {
    private class Node{
        String item;
        Node next;
    }

    public Node reverse(Node x){
        Node first=x;
        Node reverse=null;
        while(first!=null){
            Node second=first.next;
            first.next=reverse;
            reverse=first;
            first=second;
        }
        return reverse;
    }

    public Node reverse_recursion(Node first){
        if(first==null)
            return null;
        if(first.next==null)
            return first;
        Node second=first.next;
        Node rest=reverse(second);
        second.next=first;
        first.next=null;
        return rest;
    }
}