import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        long[] dp = new long[1001];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= 1000; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            System.out.println(dp[n + 1]);
        }

        sc.close();
    }
}