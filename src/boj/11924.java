import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long m = sc.nextLong();
        
        long sum = n * m;
        long gcd = gcd(n, m);
        
        System.out.println(sum / gcd);
    }
    
    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        
        return gcd(b, a % b);
    }
}