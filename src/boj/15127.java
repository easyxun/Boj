import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        if (n % a == 0 && m % a == 0) {
            System.out.println((n / a) * (m / a));
        } else {
            System.out.println(((n / a) + 1) * ((m / a) + 1));
        }

        sc.close();
    }
}