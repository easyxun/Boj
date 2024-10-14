import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        int max = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }

        int left = max;
        int right = sum;

        while (left < right) {
            int mid = (left + right) / 2;
            int cnt = 1;
            int temp = 0;

            for (int i = 0; i < N; i++) {
                if (temp + arr[i] > mid) {
                    cnt++;
                    temp = 0;
                }
                temp += arr[i];
            }

            if (cnt <= M) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(left);
    }
}