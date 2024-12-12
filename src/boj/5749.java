import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int sum = n;
            while (n >= 10) {
                int temp = n;
                int newN = 0;
                while (temp > 0) {
                    newN += temp % 10;
                    temp /= 10;
                }
                n = newN;
            }

            System.out.println(n);
        }

        sc.close();
    }
}