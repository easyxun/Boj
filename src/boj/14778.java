import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        
        long ans = 0;
        if (n % 2 == 0) {
            ans = n / 2 * m * k;
        } else if (m % 2 == 0) {
            ans = m / 2 * n * k;
        } else if (k % 2 == 0) {
            ans = k / 2 * n * m;
        } else {
            ans = (n - 1) / 2 * m * k + m / 2 * k;
        }
        
        System.out.println(ans);
    }
}