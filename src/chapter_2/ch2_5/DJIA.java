package chapter_2.ch2_5;

/**
 * DJIA
 */
public class DJIA implements Comparable<DJIA>{
    private String date;
    private int amount;

    public DJIA(String date, int amount){
        this.date=date;
        this.amount=amount;
    }

    public String getDate(){
        return date;
    }

    public int getAmount(){
        return amount;
    }
    
    public int compareTo(DJIA that){
        if(this.amount<that.amount)
            return -1;
        else if(this.amount>that.amount)
            return 1;
        else
            return 0;
    }
}