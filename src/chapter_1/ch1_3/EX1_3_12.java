package chapter_1.ch1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class EX1_3_12 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        while(!StdIn.isEmpty()){
            stack.push(StdIn.readString());
        }
        Stack<String> s=copy(stack);
        for(String string:s)
            StdOut.print(string+" ");
    }

    public static Stack<String> copy(Stack<String> stack){
        Stack<String> s=new Stack<>();
        for(String string:stack){
            s.push(string);
        }
        return s;
    }
}
