import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (n == 0 && k == 0) {
                break;
            }

            System.out.println((n + k));
        }

        sc.close();
    }
}