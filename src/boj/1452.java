import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] count = new int[10001];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }

        int result = 0;
        for (int i = 1; i <= m; i++) {
            result += count[i] * (n - count[i]);
        }

        System.out.println(result / 2);

        sc.close();
    }
}