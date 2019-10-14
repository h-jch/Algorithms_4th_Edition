package chapter_1.ch1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;

/**
 * EX1_2_3
 */
public class EX1_2_3 {

    public static void main(String[] args) {
        int N=StdIn.readInt();
        double min=StdIn.readDouble();
        double max=StdIn.readDouble();
        Point2D[] leftTopPoints = new Point2D[N];
		Point2D[] rightBottomPoints = new Point2D[N];
        Interval2D[] interval=new Interval2D[N];
        for(int i=0;i<N;i++){
            double a=StdRandom.uniform(min,max);
            double b=StdRandom.uniform(min,max);
            double left,right,top,bottom;
            Interval1D x,y;
            if(a<b){
                left=a;
                right=b;
            }else{
                left=b;
                right=a;
            }
            x=new Interval1D(left,right);
            a=StdRandom.uniform(min,max);
            b=StdRandom.uniform(min,max);
            if(a<b){
                bottom=a;
                top=b;
            }else{
                bottom=b;
                top=a;
            }
            y=new Interval1D(bottom,top);
            leftTopPoints[i] = new Point2D(left, top);
			rightBottomPoints[i] = new Point2D(right, bottom);
            interval[i]=new Interval2D(x,y);
            interval[i].draw();
        }

        int intercnt=0,contcnt=0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(interval[i].intersects(interval[j]))
                    intercnt++;
                if(interval[i].contains(leftTopPoints[j])&&interval[i].contains(rightBottomPoints[j]))
                    contcnt++;
            }
        }
        StdOut.println("Interval number: "+intercnt);
        StdOut.println("Contain number: "+contcnt);
    }
}