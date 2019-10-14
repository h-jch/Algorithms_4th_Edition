package chapter_1.ch1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Rational
 */
public class Rational {
    private final int numerator;
    private final int denominator;

    private int gcd(int p, int q){
        if(q==0)
            return p;
        int r=p%q;
        return gcd(q,r);
    }

    public Rational(int n, int d){
        if(d==0){
            throw new ArithmeticException("Divided by zero");
        }
        if(d<0){
            n=-n;
            d=-d;
        }
        int x=gcd(n,d);
        numerator=n/x;
        denominator=d/x;
    }

    public Rational plus(Rational b){
        int new_numerator=this.numerator*b.denominator+this.denominator*b.numerator;
        int new_denominator=this.denominator*b.denominator;
        Rational rational=new Rational(new_numerator, new_denominator);
        return rational;
    }

    public Rational minus(Rational b){
        int new_numerator=this.numerator*b.denominator-this.denominator*b.numerator;
        int new_denominator=this.denominator*b.denominator;
        Rational rational=new Rational(new_numerator, new_denominator);
        return rational;
    }

    public Rational times(Rational b){
        int new_numerator=this.numerator*b.numerator;
        int new_denominator=this.denominator*b.denominator;
        Rational rational=new Rational(new_numerator, new_denominator);
        return rational;
    }

    public Rational divides(Rational b){
        int new_numerator=this.numerator*b.denominator;
        int new_denominator=this.denominator*b.numerator;
        Rational rational=new Rational(new_numerator, new_denominator);
        return rational;
    }

    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(this.getClass()!=obj.getClass())
            return false;
        Rational that=(Rational) obj;
        if(this.numerator!=that.numerator)
            return false;
        if(this.denominator!=that.denominator)
            return false;
        return true;
    }

    @Override
    public String toString(){
        if(numerator%denominator==0)
            return String.valueOf(numerator/denominator);
        else
            return numerator+"/"+denominator;
    }

    public static void main(String[] args) {
        int x=StdIn.readInt();
        int y=StdIn.readInt();
        Rational rational1=new Rational(x, y);
        x=StdIn.readInt();
        y=StdIn.readInt();
        Rational rational2=new Rational(x, y);
        StdOut.println("rational1: "+rational1.toString());
        StdOut.println("rational2: "+rational2.toString());
        StdOut.println("rational1 plus rational2: "+rational1.plus(rational2));
        StdOut.println("rational1 minus rational2: "+rational1.minus(rational2));
        StdOut.println("rational1 times rational2: "+rational1.times(rational2));
        StdOut.println("rational1 divides rational2: "+rational1.divides(rational2));
        StdOut.println("rational1 equals rational2: "+rational1.equals(rational2));
    }
}