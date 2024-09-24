import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        while (n != 0 && m != 0) {
            int gcd = gcd(n, m);
            long lcm = (long) n * m / gcd;

            System.out.println(lcm);

            n = sc.nextInt();
            m = sc.nextInt();
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}