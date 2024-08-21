import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        int prev = 0;
        int result = 1;
        for (int i = 0; i < m; i++) {
            int vip = sc.nextInt();
            result *= dp[vip - prev - 1];
            prev = vip;
        }
        
        result *= dp[n - prev];
        
        System.out.println(result);
    }
}