import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int answer = Integer.MAX_VALUE;

        int start = 0;
        int end = 0;

        while (end < N) {
            int diff = arr[end] - arr[start];

            if (diff < M) {
                end++;
            } else {
                answer = Math.min(answer, diff);
                start++;
            }
        }

        System.out.println(answer);
    }
}