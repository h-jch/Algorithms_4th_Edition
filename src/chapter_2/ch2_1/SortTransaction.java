package chapter_2.ch2_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import chapter_1.ch1_3.Queue;

/**
 * SortTransaction
 */
public class SortTransaction {
    public static Transaction[] readTransactions(){
        Queue<Transaction> queue=new Queue<Transaction>();
        while(StdIn.hasNextLine()){
            String line=StdIn.readLine();
            queue.enqueue(new Transaction(line));
        }
        Transaction[] transactions=new Transaction[queue.size()];
        for(int i=0;i<transactions.length;i++)
            transactions[i]=queue.dequeue();
        return transactions;
    }

    public static void main(String[] args) {
        Transaction[] transactions=readTransactions();
        Shell.sort(transactions);
        for(Transaction t:transactions)
            StdOut.println(t);
    }
}