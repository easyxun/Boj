import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long gcd = 0;
        
        for (long i = 1; i <= n; i++) {
            gcd += n / i * i;
        }
        
        System.out.println(gcd);
        
        sc.close();
    }
}