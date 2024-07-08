import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = solve(n, 0, 0, 0);
        System.out.println(result);
    }

    public static int solve(int n, int x, int y, int direction) {
        if (n == 0) {
            if (x == 0 && y == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        int[] dx = {0, 1, 1, 0, -1, -1};
        int[] dy = {2, 1, -1, -2, -1, 1};

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            if (i == (direction + 3) % 6) {
                continue;
            }
            sum += solve(n - 1, x + dx[i], y + dy[i], i);
        }

        return sum;
    }
}