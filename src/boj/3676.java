import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] dp = new int[m + 1];
            
            dp[0] = 1;
            dp[1] = 1;
            
            for (int i = 2; i <= m; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
                dp[i] %= 1000000007;
            }
            
            System.out.println(dp[m]);
        }
        
        sc.close();
    }
}