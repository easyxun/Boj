import java.util.Scanner;

public class Main {
    static int[] paper = {0, 5, 5, 5, 5, 5};
    static int[][] map = new int[10][10];
    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        dfs(0, 0, 0);

        if (result == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }

    static void dfs(int x, int y, int cnt) {
        if (y == 10) {
            dfs(x + 1, 0, cnt);
            return;
        }

        if (x == 10) {
            result = Math.min(result, cnt);
            return;
        }

        if (map[x][y] == 1) {
            for (int k = 5; k >= 1; k--) {
                if (paper[k] > 0 && check(x, y, k)) {
                    cover(x, y, k, 0);
                    paper[k]--;
                    dfs(x, y + 1, cnt + 1);
                    paper[k]++;
                    cover(x, y, k, 1);
                }
            }
        } else {
            dfs(x, y + 1, cnt);
        }
    }

    static boolean check(int x, int y, int size) {
        if (x + size > 10 || y + size > 10) {
            return false;
        }

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (map[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    static void cover(int x, int y, int size, int num) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                map[i][j] = num;
            }
        }
    }
}