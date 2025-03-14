import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[m][n];

        for (int i = 0; i < m; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int whitePower = 0;
        int blackPower = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                char color = arr[i][j];
                if (color == 'W') {
                    whitePower += dfs(arr, i, j, color);
                } else if (color == 'B') {
                    blackPower += dfs(arr, i, j, color);
                }
            }
        }

        System.out.println(whitePower + " " + blackPower);
    }

    public static int dfs(char[][] arr, int x, int y, char color) {
        if (x < 0 || x >= arr.length || y < 0 || y >= arr[0].length || arr[x][y] != color) {
            return 0;
        }

        arr[x][y] = 'X';
        int power = 1;

        power += dfs(arr, x + 1, y, color);
        power += dfs(arr, x - 1, y, color);
        power += dfs(arr, x, y + 1, color);
        power += dfs(arr, x, y - 1, color);

        return power;
    }
}