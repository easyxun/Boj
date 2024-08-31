import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] * dp[i-2] % 1000000007;
            if (arr[i] == 0) {
                dp[i] = (dp[i] * 2) % 1000000007;
            } else {
                dp[i] = (dp[i] * dp[arr[i]]) % 1000000007;
            }
        }

        System.out.println(dp[n]);
    }
}