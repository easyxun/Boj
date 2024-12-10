import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }

            int maxSum = 0;
            int currentSum = 0;

            for (int j = 0; j < N; j++) {
                currentSum = Math.max(arr[j], currentSum + arr[j]);
                maxSum = Math.max(maxSum, currentSum);
            }

            System.out.println(maxSum);
        }

        sc.close();
    }
}