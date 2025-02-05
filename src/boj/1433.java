import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        
        int[] dp = new int[11];
        dp[s] = 1;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                if (dp[j] == 0) continue;
                for (int k = 1; k <= m; k++) {
                    if (j + k <= m) {
                        dp[j + k] += dp[j];
                    }
                }
            }
        }
        
        System.out.println(dp[m]);
    }
}