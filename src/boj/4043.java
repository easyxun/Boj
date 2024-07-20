import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < N; i++) {
            currentSum = 0;
            for (int j = 0; j < N; j++) {
                currentSum += arr[(i + j) % N];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println(maxSum);
    }
}