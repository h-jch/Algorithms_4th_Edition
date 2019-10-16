package chapter_1.ch1_4;

import edu.princeton.cs.algs4.Stack;

public class QueueOfTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueOfTwoStacks(){
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void enqueue(int x){
        stack1.push(x);
    }

    public int dequeue(){
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }
        else
            return stack2.pop();
    }

    public boolean isEmpty(){
        return stack1.isEmpty()&&stack2.isEmpty();
    }

    public int size(){
        return stack1.size()+stack2.size();
    }
}
