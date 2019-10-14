package chapter_2.ch2_5;

/**
 * Job
 */
public class Job implements Comparable<Job>{
    private String name;
    private double time;

    public Job(String name, double time){
        this.name=name;
        this.time=time;
    }

    public String getName(){
        return name;
    }

    public double getTime(){
        return time;
    }

    @Override
    public int compareTo(Job that){
        if(this.time<that.time)
            return -1;
        else if(this.time>that.time)
            return 1;
        else
            return 0;
    }

    public String toString(){
        return name+": "+time;
    }
    
}