import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[][] grid = new int[N][N];
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (j >= x1 && j <= x2 && k >= y1 && k <= y2) {
                        grid[j][k] = 1;
                    }
                }
            }

            int result = countRectangles(grid, N);
            System.out.println(result);
        }
    }

    public static int countRectangles(int[][] grid, int N) {
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = i; k < N; k++) {
                    for (int l = j; l < N; l++) {
                        if (isRectangle(grid, i, j, k, l)) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    public static boolean isRectangle(int[][] grid, int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if (grid[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }
}