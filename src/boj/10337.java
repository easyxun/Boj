import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] arr = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }

            int sum = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    sum += arr[j][k];
                }
            }

            System.out.println(sum);
        }
    }
}