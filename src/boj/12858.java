import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        long result = 0;
        while (n > 1) {
            if (n % k == 0) {
                n /= k;
                result++;
            } else {
                n--;
                result++;
            }
        }

        System.out.println(result);
    }
}