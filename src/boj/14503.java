import java.util.Scanner;

public class Main {
    static int N, M;
    static int[][] map;
    static int r, c, d;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];

        r = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;
        while (true) {
            if (map[r][c] == 0) {
                map[r][c] = 2;
                cnt++;
            }

            boolean flag = false;
            for (int i = 0; i < 4; i++) {
                d = (d + 3) % 4;
                int nr = r + dr[d];
                int nc = c + dc[d];

                if (map[nr][nc] == 0) {
                    r = nr;
                    c = nc;
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                int nr = r - dr[d];
                int nc = c - dc[d];

                if (map[nr][nc] == 1) {
                    break;
                } else {
                    r = nr;
                    c = nc;
                }
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}