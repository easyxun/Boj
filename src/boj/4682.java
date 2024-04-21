import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            long n = sc.nextLong();
            if (n == 0) {
                break;
            }
            
            long sum = 0;
            for (long i = 1; i <= n; i++) {
                sum += i * i;
            }
            
            System.out.println(sum);
        }
        
        sc.close();
    }
}