```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ' ';
            }
        }

        drawStars(arr, 0, 0, n);

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void drawStars(char[][] arr, int x, int y, int n) {
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        int m = n / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != 1 || j != 1) {
                    drawStars(arr, x + i * m, y + j * m, m);
                }
            }
        }
    }
}
```