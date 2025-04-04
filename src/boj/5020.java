import java.util.*;

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

            Arrays.sort(arr);

            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += arr[j];
            }

            int minSum = 0;
            for (int j = 0; j < N; j++) {
                minSum += arr[j] * (N - j);
            }

            System.out.println(minSum - sum);
        }
    }
}