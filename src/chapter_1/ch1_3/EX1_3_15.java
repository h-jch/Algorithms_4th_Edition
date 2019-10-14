package chapter_1.ch1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Queue;

/**
 * EX1_3_15
 */
public class EX1_3_15 {

    public static void main(String[] args) {
        int k=StdIn.readInt();
        Queue<String> queue=new Queue<String>();
        while(!StdIn.isEmpty()){
            queue.enqueue(StdIn.readString());
        }
        while(queue.size()>k){
            queue.dequeue();
        }
        StdOut.println(queue.dequeue());
    }
}