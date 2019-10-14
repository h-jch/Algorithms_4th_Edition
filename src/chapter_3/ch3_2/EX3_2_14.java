package chapter_3.ch3_2;

/**
 * EX3_2_14
 */
public class EX3_2_14<Key, Value> {
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

    public Key min(){
        if(root==null)
            return null;
        Node x=root;
        while(x.left!=null){
            x=x.left;
        }
        return x.key;
    }

    public Key max(){
        if(root==null)
            return null;
        Node x=root;
        while(x.right!=null){
            x=x.right;
        }
        return x.key;
    }
    
}