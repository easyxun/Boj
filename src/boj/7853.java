import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        int n = input.length();
        long[] dp = new long[n];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1];
            if (i > 1 && input.charAt(i) != input.charAt(i - 1)) {
                dp[i] += dp[i - 2];
            }
            dp[i]++;
        }

        System.out.println(dp[n - 1]);
    }
}