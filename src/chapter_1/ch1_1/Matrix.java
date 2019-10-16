package chapter_1.ch1_1;

public class Matrix {
    public static double dot(double[] x, double[] y){
        if(x.length!=y.length)      //cannot dot two vectors that do not have equal length
            return -1;
        double res=0;
        for(int i=0;i<x.length;i++){
            res+=x[i]*y[i];
        }
        return res;
    }

    public static double[][] mult(double[][] a, double[][] b){
        double[][] res=new double[a.length][b[0].length];
        if(a[0].length!=b.length)       //cannot multiply two matrix
            return res;
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                for(int k=0;k<b.length;k++)
                    res[i][j]+=a[i][k]*b[k][j];
            }
        }
        return res;
    }

    public static double[][] transpose(double[][] a){
        double[][] res=new double[a[0].length][a.length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[i].length;j++)
                res[j][i]=a[i][j];
        return res;
    }

    public static double[] mult(double[][] a, double[] x){
        double[] res=new double[a.length];
        if(a[0].length!=x.length)
            return res;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
                res[i]+=a[i][j]*x[j];
        }
        return res;
    }

    public static double[] mult(double[] y, double[][] a){
        double[] res=new double[a[0].length];
        if(y.length!=a.length)
            return res;
        for(int i=0;i<a[0].length;i++){
            for(int j=0;j<y.length;j++)
                res[i]+=y[j]*a[j][i];
        }
        return res;
    }
}
