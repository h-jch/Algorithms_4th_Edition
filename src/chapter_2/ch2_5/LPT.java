package chapter_2.ch2_5;

import java.util.ArrayList;
import java.util.Arrays;

import edu.princeton.cs.algd4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.MinPQ;

/**
 * LPT
 */
public class LPT {

    public static void main(String[] args) {
        int M=StdIn.readInt();
        int N=StdIn.readInt();
        Job[] jobs=new Job[N];
        for(int i=0;i<N;i++)
            jobs[i]=new Job(StdIn.readString(),StdIn.readDouble());
        Arrays.sort(jobs);

        MinPQ<Processor> processorPQ=new MinPQ<>(M);
        for(int i=0;i<M;i++)
            processorPQ.insert(new Processor());
        
        for(int i=N-1;i>=0;i--){
            Processor processor=processorPQ.delMin();       //把time最长的job交给totalTime最小的processor
            Processor.insert(jobs[i]);
            processorPQ.insert(processor);
        }

        for(int i=0;!processorPQ.isEmpty();i++){
            Processor processor=processorPQ.delMin();
            ArrayList<Job> jobList=processor.getJobs();
            StdOut.println("Processor "+i+":");
            for(int j=0;j<jobList.size();j++)
                StdOut.println(jobList.get(j));
        }
    }
}