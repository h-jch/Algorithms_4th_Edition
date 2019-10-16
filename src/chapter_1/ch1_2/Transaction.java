package chapter_1.ch1_2;

/**
 * Transaction
 */
public class Transaction {
    private String who;
    private Date when;
    private double amount;

    public Transaction(String who, Date when, double amount){
        this.who=who;
        this.when=when;
        this.amount=amount;
    }

    /**
     * EX1.2.19
     */
    public Transaction(String transaction){
        String[] fields=transaction.split("\\s+");      //匹配任意空白字符
        who=fields[0];
        when=new Date(fields[1]);
        amount=Double.parseDouble(fields[2]);
    }

    public String getWho(){
        return who;
    }

    public Date getWhen(){
        return when;
    }

    public double getAmount(){
        return amount;
    }

    public void setWho(String who){
        this.who=who;
    }

    public void setWhen(Date when){
        this.when=when;
    }

    public void setAmount(double amount){
        this.amount=amount;
    }

    /**
     * EX1.2.14
     */
    public boolean equals(Object x){
        if(this==x)
            return true;
        if(x==null)
            return false;
        if(this.getClass()!=x.getClass())
            return false;
        Transaction that=(Transaction) x;
        if(this.who!=that.who)
            return false;
        if(this.when!=that.when)
            return false;
        if(this.amount!=that.amount)
            return false;
        return true;
    }
}