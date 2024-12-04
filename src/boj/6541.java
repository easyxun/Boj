import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int x = n / a;
            int y = m / b;

            if (n % a != 0) {
                x++;
            }
            if (m % b != 0) {
                y++;
            }

            System.out.println(x * y);
        }

        sc.close();
    }
}