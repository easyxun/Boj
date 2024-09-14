import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] board = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        int y = sc.nextInt();

        boolean isExist = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == x && board[i][(j+1)%m] == y) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                break;
            }
        }

        System.out.println(isExist ? "YES" : "NO");
    }
}