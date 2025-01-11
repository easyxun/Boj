import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int max = 0;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur += arr[i];
            max = Math.max(max, cur);
            max = Math.max(max, sum - cur);
        }

        System.out.println(max);
    }
}