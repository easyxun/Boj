import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = a;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i-1] * a + dp[i-2] * b) % 1000;
        }
        
        long result = 0;
        for (int i = 0; i <= n; i++) {
            result = (result + dp[i]) % 1000;
        }
        
        System.out.println(result);
    }
}