import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        
        int[] dp = new int[num.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        
        for (int i = 2; i <= num.length(); i++) {
            if (num.charAt(i-1) != '0') {
                dp[i] += dp[i-1];
            }
            
            int twoDigits = Integer.parseInt(num.substring(i-2, i));
            if (twoDigits >= 10 && twoDigits <= 34) {
                dp[i] += dp[i-2];
            }
        }
        
        System.out.println(dp[num.length()]);
    }
}