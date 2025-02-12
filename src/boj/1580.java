import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long m = sc.nextLong();
        long result = 1;

        for (long i = n; i > n - m; i--) {
            result = (result * i) % 1000000007;
        }

        System.out.println(result);
    }
}