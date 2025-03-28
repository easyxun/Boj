import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();

            int sum = 0;
            for (int j = p-1; j < q; j++) {
                sum += arr[j];
            }

            System.out.println(sum);
        }
    }
}