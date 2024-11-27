import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= n;
            result %= 1000000007;
        }

        System.out.println(result);
    }
}