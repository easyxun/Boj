import java.util.Scanner;

public class Main {
    static int N, M, H;
    static int[][] ladder;
    static int answer = 4;

    public static boolean checkLadder() {
        for (int i = 1; i <= N; i++) {
            int current = i;
            for (int j = 1; j <= H; j++) {
                if (ladder[j][current] == 1) {
                    current++;
                } else if (ladder[j][current - 1] == 1) {
                    current--;
                }
            }
            if (current != i) {
                return false;
            }
        }
        return true;
    }

    public static void dfs(int x, int y, int count) {
        if (count >= answer) {
            return;
        }

        if (checkLadder()) {
            answer = Math.min(answer, count);
            return;
        }

        if (count == 3) {
            return;
        }

        for (int i = x; i <= H; i++) {
            for (int j = 1; j < N; j++) {
                if (ladder[i][j] == 0 && ladder[i][j - 1] == 0 && ladder[i][j + 1] == 0) {
                    ladder[i][j] = 1;
                    dfs(i, j, count + 1);
                    ladder[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        H = sc.nextInt();

        ladder = new int[H + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ladder[a][b] = 1;
        }

        dfs(1, 1, 0);

        if (answer == 4) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }
}