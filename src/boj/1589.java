import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();
        long r = sc.nextLong();

        long result = 0;
        if (r % 2 == 0) {
            result = r / 2 * n * m;
        } else {
            result = (r / 2) * n * m + (n + m) / 2 + 1;
        }

        System.out.println(result);

        sc.close();
    }
}