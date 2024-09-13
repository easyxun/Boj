import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            
            long result = 1;
            for (int i = 2; i * i <= n; i++) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                if (count % 2 == 1) {
                    result *= i;
                }
            }
            if (n > 1) {
                result *= n;
            }
            
            System.out.println(result);
        }
        
        sc.close();
    }
}