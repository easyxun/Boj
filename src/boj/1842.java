import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;

        for (long i = 1; i <= n; i++) {
            sum += i * (n / i);
        }

        System.out.println(sum);

        sc.close();
    }
}