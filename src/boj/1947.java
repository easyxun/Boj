import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 0;
        dp[2] = 1;
        
        for (int i = 3; i <= n; i++) {
            dp[i] = (i - 1) * (dp[i-1] + dp[i-2]) % 1000000000;
        }
        
        System.out.println(dp[n]);
    }
}