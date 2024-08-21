import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }
            
            long sum = 0;
            long maxSum = 0;
            
            for (int i = 1; i <= n; i++) {
                int num = sc.nextInt();
                sum += num;
                maxSum = Math.max(maxSum, sum);
                if (sum < 0) {
                    sum = 0;
                }
            }
            
            System.out.println("Max sum: " + maxSum);
        }
        
        sc.close();
    }
}