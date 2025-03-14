import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxDiff = 0;
        int maxDiffIndex = 0;
        for (int i = 0; i < n; i++) {
            int diff = 0;
            for (int j = 0; j < n; j++) {
                diff += Math.abs(arr[i] - arr[j]);
            }
            if (diff > maxDiff) {
                maxDiff = diff;
                maxDiffIndex = i;
            }
        }

        System.out.println(maxDiffIndex);
    }
}