import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int result = 0;
            for (int j = 1; j <= n; j++) {
                result += Math.pow(j, k);
            }

            System.out.println(i + " " + result);
        }

        sc.close();
    }
}