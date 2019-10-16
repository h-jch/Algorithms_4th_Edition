package chapter_1.ch1_4;

import edu.princeton.cs.algs4.Queue;

public class StackOfQueue {
    private Queue<Integer> queue;
    private int N;

    public StackOfQueue(){
        queue=new Queue<>();
        N=0;
    }

    public void push(int x){
        queue.enqueue(x);
        N++;
        for(int i=0;i<N-1;i++)
            queue.enqueue(queue.dequeue());
    }

    public int pop(){
        return queue.dequeue();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return N;
    }
}
