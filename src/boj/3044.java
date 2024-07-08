import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = n;

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (result == a) {
                result = b;
            } else if (result == b) {
                result = a;
            }
        }

        System.out.println(result);

        sc.close();
    }
}