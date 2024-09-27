import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long result = 1;
        
        for (long i = 2; i <= n; i++) {
            result *= i;
            result %= 1000000007;
        }
        
        System.out.println(result);
        
        sc.close();
    }
}