package chapter_1.ch1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Parentheses
 */
public class Parentheses {

    public static void main(String[] args) {
        Stack<Character> stack=new Stack<Character>();
        while(!StdIn.isEmpty()){
            char c=StdIn.readChar();
            if(c=='('||c=='['||c=='{')
                stack.push(c);
            if(c==')'||c==']'||c=='}'){
                char a=stack.pop();
                if(a!=c){
                    StdOut.println("false");
                    return;
                }
            }
        }
        StdOut.println("true");
    }
}