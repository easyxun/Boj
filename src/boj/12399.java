import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int result = 0;

        while (n > 0) {
            if (n % k == 0) {
                n /= k;
                result++;
            } else {
                n--;
                result++;
            }
        }

        System.out.println(result);
    }
}