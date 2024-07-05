import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int ans = 0;
        while (k > 0) {
            if (n >= 2 * m) {
                n--;
            } else {
                m--;
            }
            k--;
        }

        ans = Math.min(n / 2, m);

        System.out.println(ans);
    }
}