package chapter_1.ch1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;

/**
 * InfixToPostfix
 */
public class InfixToPostfix {

    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        while(!StdIn.isEmpty()){
            String s=StdIn.readString();
            switch(s){
                case "+":
                case "-":
                case "*":
                case "/":
                    stack.push(s);
                    break;
                case "(":
                    break;
                case ")":
                    StdOut.print(stack.pop()+" ");
                    break;
                default:
                    StdOut.print(s+" ");
            }
        }
        StdOut.println();
    }
}