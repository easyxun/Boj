import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Slugs: ");

        for (int i = 1; i <= n; i++) {
            int s = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int result = s + 2 * b + 3 * c;
            if (result < 10) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}