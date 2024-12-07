import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int T = sc.nextInt();

        int[][] map = new int[21][21];
        int[][] dp = new int[21][21];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x][y] = 1;
        }

        dp[startX][startY] = 1;

        for (int t = 0; t < T; t++) {
            int[][] temp = new int[21][21];

            for (int x = 1; x <= 20; x++) {
                for (int y = 1; y <= 20; y++) {
                    if (map[x][y] == 1) {
                        continue;
                    }

                    temp[x][y] = dp[x-1][y] + dp[x+1][y] + dp[x][y-1] + dp[x][y+1];
                    temp[x][y] %= 1000000007;
                }
            }

            dp = temp;
        }

        int answer = dp[startX][startY];
        System.out.println(answer);

        sc.close();
    }
}