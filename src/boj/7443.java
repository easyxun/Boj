import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int count = 0;
            
            for (int i = 1; i <= n / 2; i++) {
                count += Math.min(i, n - i - 1);
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}