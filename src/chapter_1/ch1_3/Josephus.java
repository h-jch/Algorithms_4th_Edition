package chapter_1.ch1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Queue;

/**
 * Josephus
 */
public class Josephus {

    public static void main(String[] args) {
        int N=StdIn.readInt();
        int M=StdIn.readInt();

        Queue<Integer> queue=new Queue<Integer>();

        for(int i=0;i<N;i++)
            queue.enqueue(i);

        while(!queue.isEmpty()){
            for(int i=0;i<M-1;i++){
                queue.enqueue(queue.dequeue());
            }
            StdOut.print(queue.dequeue()+" ");
        }
        StdOut.println();
    }
}