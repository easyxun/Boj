import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            int maxSum = arr[0];
            int currentSum = arr[0];

            for (int j = 1; j < n; j++) {
                currentSum = Math.max(arr[j], currentSum + arr[j]);
                maxSum = Math.max(maxSum, currentSum);
            }

            System.out.println(maxSum);
        }
    }
}