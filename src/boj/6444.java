import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            int gcd = gcd(a, b);
            int lcm = a * b / gcd;

            System.out.println(gcd + " " + lcm);
        }

        sc.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}