import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            double p = sc.nextDouble();

            double[][] dp = new double[N + 1][K + 1];
            dp[0][0] = 1;

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= K; j++) {
                    dp[i][j] = p * dp[i - 1][j - 1] + (1 - p) * dp[i - 1][j];
                }
            }

            System.out.printf("%.4f\n", dp[N][K]);
        }
    }
}