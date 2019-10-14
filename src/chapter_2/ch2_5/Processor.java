package chapter_2.ch2_5;

import java.util.ArrayList;

/**
 * Processor
 */
public class Processor implements Comparable<Processor>{
    private ArrayList<Job> jobs;
    private double totalTime;

    public Processor(){
        jobs=new ArrayList<>();
        totalTime=0;
    }

    public ArrayList<Job> getJobs(){
        return jobs;
    }

    public double getTotalTime(){
        return totalTime;
    }

    public void insert(Job job){
        jobs.add(job);
        totalTime+=job.getTime();
    }

    @Override
    public int compareTo(Processor that){
        if(this.totalTime<that.totalTime)
            return -1;
        else if(this.totalTime>that.totalTime)
            return 1;
        else
            return 0;
    }
    
}