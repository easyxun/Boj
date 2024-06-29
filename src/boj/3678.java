import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[1001];

        dp[1] = 2;
        dp[2] = 3;
        dp[3] = 4;

        for (int i = 4; i <= 1000; i++) {
            dp[i] = dp[i - 2] + dp[i - 3];
        }

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            System.out.println(dp[x]);
        }
    }
}