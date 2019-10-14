package chapter_3.ch3_1;

/**
 * Time
 */
public class Time implements Comparable<Time>{
    private int hour;
    private int min;
    private int sec;

    public Time(int h, int m, int s){
        this.hour=h;
        this.min=m;
        this.sec=s;
    }

    public int getHour(){
        return hour;
    }

    public int getMin(){
        return min;
    }

    public int getSec(){
        return sec;
    }
    
    @Override
    public int compareTo(Time that) {
        if(this.hour<that.hour)
            return -1;
        if(this.hour>that.hour)
            return 1;
        if(this.min<that.min)
            return -1;
        if(this.min>that.min)
            return 1;
        if(this.sec<that.sec)
            return -1;
        if(this.sec>that.sec)
            return 1;
        return 0;
    }

    @Override
    public String toString(){
        return hour+":"+min+":"+sec;
    }
}