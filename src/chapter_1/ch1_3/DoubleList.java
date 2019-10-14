package chapter_1.ch1_3;

/**
 * DoubleList
 */
public class DoubleList<Item> {
    private DoubleNode first;
    private DoubleNode last;
    private int N;
    private class DoubleNode{
        Item item;
        DoubleNode prev;
        DoubleNode next;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public int size(){
        return N;
    }

    public Item first(){
        if(isEmpty())
            throw new RuntimeException("List is empty");
        return first.item;
    }

    public Item last(){
        if(isEmpty())
            throw new RuntimeException("List is empty");
        return last.item;
    }

    public void prepend(Item item){
        DoubleNode oldfirst=first;
        first=new DoubleNode();
        first.item=item;
        if(isEmpty()){
            last=first;
        }else{
            first.next=oldfirst;
            oldfirst.prev=first;
        }
        N++;
    }
    
    public void append(Item item){
        DoubleNode oldlast=last;
        last=new DoubleNode();
        last.item=item;
        last.next=null;
        if(isEmpty())
            first=last;
        else{
            oldlast.next=last;
            last=prev=oldlast;
        }
        N++;
    }

    public void insertBefore(DoubleNode node, Item item){
        if(node==null)
            return;
        else if(node==first)
            prepend(item);
        else{
            DoubleNode p=node.prev;
            DoubleNode InsertItem=new DoubleNode();
            InsertItem.item=item;
            InsertItem.next=node;
            InsertItem.prev=p;
            p.next=InsertItem;
            node.prev=InsertItem;
            N++;
        }
    }

    public void insertAfter(DoubleNode node, Item item){
        if(node==null)
            return;
        else if(node==last)
            append(item);
        else{
            DoubleNode p=node.next;
            DoubleNode InsertItem=new DoubleNode();
            InsertItem.item=item;
            InsertItem.next=p;
            InsertItem.prev=node;
            node.next=InsertItem;
            p.prev=InsertItem;
            N++;
        }
    }

    public Item removeFirst(){
        if(isEmpty())
            throw new RuntimeException("List is empty");
        Item item=first.item;
        if(first.next!=null)
            first.next.prev=null;
        first=first.next;
        N--;
        if(first==null)
            last=null;
        return item;
    }

    public Item removeLast(){
        if(isEmpty())
            throw new RuntimeException("List is Empty");
        Item item=last.item;
        if(last.prev!=null)
            last.prev.next=null;
        last=last.prev;
        N--;
        if(last==null)
            first=null;
        return item;
    }

    public Item remove(DoubleNode node){
        if(node==first)
            return removeFirst();
        else if(node==last)
            return removeLast();
        else{
            DoubleNode p=node.prev;
            DoubleNode n=node.next;
            Item item=node.item;
            p.next=n;
            n.prev=p;
            N--;
            return item;
        }
    }
}