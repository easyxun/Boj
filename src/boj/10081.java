import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] dp = new double[101];
        dp[0] = 1.0;
        
        for (int i = 1; i <= 100; i++) {
            dp[i] = dp[i-1] * 0.5;
            if (i >= 2) {
                dp[i] += dp[i-2] * 0.5;
            }
            if (i >= 3) {
                dp[i] += dp[i-3] * 0.5;
            }
        }
        
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.printf("%.10f\n", dp[n]);
        }
        
        sc.close();
    }
}