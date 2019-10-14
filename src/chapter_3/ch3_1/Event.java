package chapter_3.ch3_1;

/**
 * Event
 */
public class Event implements Comparable<Event>{
    private String dist;

    public Event(String dist){
        this.dist=dist;
    }

    public String getDist(){
        return dist;
    }

    @Override
    public int compareTo(Event that) {
        if(this.dist.compareTo(that.dist)<0)
            return -1;
        else if(this.dist.compareTo(that.dist)>0)
            return 1;
        else
            return 0;
    }
    
}