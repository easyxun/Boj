import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int sum = 0;
        int start = 0;
        int end = 0;
        int maxStart = 0;
        int maxEnd = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum < 0) {
                sum = 0;
                start = i + 1;
            }

            if (max < sum) {
                max = sum;
                maxStart = start;
                maxEnd = i;
            }
        }

        System.out.println(max + " " + maxStart + " " + maxEnd);
    }
}