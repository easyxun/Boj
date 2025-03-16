import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            boolean isPrime = true;

            if (num == 1) {
                continue;
            }

            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}