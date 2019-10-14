package chapter_1.ch1_3;

import java.util.Stack;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * EvaluatePostfix
 */
public class EvaluatePostfix {

    public static void main(String[] args) {
        Stack<Double> stack=new Stack<Double>();
        while(!StdIn.isEmpty()){
            String s=StdIn.readString();
            double result;
            switch(s){
                case "+":
                    result=stack.pop()+stack.pop();
                    stack.push(result);
                    break;
                case "-":
                    result=stack.pop()-stack.pop();
                    stack.push(result);
                    break;
                case "*":
                    result=stack.pop()*stack.pop();
                    stack.push(result);
                    break;
                case "/":
                    result=stack.pop()/stack.pop();
                    stack.push(result);
                    break;
                default:
                    stack.push(Double.parseDouble(s));
            }
        }
        StdOut.println(stack.pop());
    }
}