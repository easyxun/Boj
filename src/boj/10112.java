import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            char[][] map = new char[N][M];
            for (int i = 0; i < N; i++) {
                String line = sc.next();
                for (int j = 0; j < M; j++) {
                    map[i][j] = line.charAt(j);
                }
            }

            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (map[i][j] == 'o') {
                        dfs(map, i, j);
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        sc.close();
    }

    private static void dfs(char[][] map, int i, int j) {
        if (i < 0 || i >= map.length || j < 0 || j >= map[0].length || map[i][j] != 'o') {
            return;
        }

        map[i][j] = '.';
        dfs(map, i - 1, j);
        dfs(map, i + 1, j);
        dfs(map, i, j - 1);
        dfs(map, i, j + 1);
    }
}