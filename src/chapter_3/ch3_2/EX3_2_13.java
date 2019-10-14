package chapter_3.ch3_2;

/**
 * EX3_2_13
 */
public class EX3_2_13<Key extends Comparable<Key>, Value>{
    private Node root;
    private class Node {
        private Key key;
        private Value val;
        private Node left,right;
        
        public Node(Key key, Value val){
            this.key=key;
            this.val=val;
        }
    }

    public Value get(Key key){
        Node x=root;
        while(x!=null){
            int cmp=key.compareTo(x.key);
            if(cmp<0)
                x=x.left;
            else if(cmp>0)
                x=x.right;
            else
                return x.val;
        }
        return null;
    }

    public void put(Key key, Value val){
        if(root==null){
            root=new Node(key,val);
            return;
        }
        Node x=root,parent=null;
        while(x!=null){     //为了确定parent，也就是插入位置
            parent=x;
            int cmp=key.compareTo(x.key);
            if(cmp<0)
                x=x.left;
            else if(cmp>0)
                x=x.right;
            else{
                x.val=val;
                return;
            }
        }
        int cmp=key.compareTo(parent.key);      //插入的结点作为parent的子节点
        if(cmp<0)
            parent.left=new Node(key,val);
        else
            parent.right=new Node(key,val);
    }
    
}