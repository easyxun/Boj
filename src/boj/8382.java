import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);

            int result = 2 * Math.min(dx, dy) + 2 * Math.abs(dx - dy) - (dx != dy ? 1 : 0);

            System.out.println("#" + t + " " + result);
        }

        sc.close();
    }
}