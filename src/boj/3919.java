import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int max = Integer.MIN_VALUE;
            int count = 0;

            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }

                if (n > max) {
                    max = n;
                }

                count++;
            }

            System.out.println("The maximum number is " + max + ".");
            System.out.println("The number of steps is " + count + ".");
        }

        sc.close();
    }
}