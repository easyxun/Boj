import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int minSum = sum;
        int minIndex = 0;

        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum < minSum) {
                minSum = sum;
                minIndex = i - k + 1;
            }
        }

        System.out.println(minIndex + 1);
    }
}