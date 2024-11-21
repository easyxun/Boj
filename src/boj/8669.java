import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
        
        long[] dp = new long[51];
        dp[0] = a;
        dp[1] = b;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        System.out.println(dp[(int)n]);
    }
}