import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            int[][] grid = new int[N][M];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    grid[j][k] = sc.nextInt();
                }
            }

            int count = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (grid[j][k] == 1) {
                        int tempSum = 0;
                        for (int r = j; r < Math.min(N, j + K); r++) {
                            for (int c = k; c < Math.min(M, k + K); c++) {
                                tempSum += grid[r][c];
                            }
                        }
                        if (tempSum == K * K) {
                            count++;
                        }
                    }
                }
            }

            System.out.println("Case #" + (i + 1) + ": " + count);
        }

        sc.close();
    }
}