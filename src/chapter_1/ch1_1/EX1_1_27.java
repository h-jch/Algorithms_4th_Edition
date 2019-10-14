package chapter_1.ch1_1;

/**
 * EX1_1_27
 */
public class EX1_1_27 {

    public static void main(String[] args) {
        double x=binomial(10, 5, 0.25);
        double y=new_binomial(100, 50, 0.25);
        System.out.println(cnt);
        System.out.println(x);
        System.out.println(y);
    }

    static int cnt=0;

    public static double binomial(int N, int k, double p){
        cnt++;
        if(N==0&&k==0)
            return 1.0;
        if(N<0||k<0)
            return 0.0;
        return (1.0-p)*binomial(N-1, k, p)+p*binomial(N-1, k-1, p);
    }

    public static double new_binomial(int N, int k, double p){
        double[][] b = new double[N + 1][k + 1];
 
        for (int i = 0; i <= N; i++)
            b[i][0] = Math.pow(1.0 - p, i);
 
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= k; j++) {
                b[i][j] = p * b[i - 1][j - 1] + (1.0 - p) * b[i - 1][j];
            }
        }
        return b[N][k];
    }
}