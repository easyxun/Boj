import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        long result = 0;
        long mod = 1_000_000_007;
        
        for (long i = 1; i <= n; i++) {
            result = (result + (m * i) % mod) % mod;
        }
        
        System.out.println(result);
    }
}