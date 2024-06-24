import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        int[][] A = new int[H + X][W + Y];
        int[][] B = new int[H][W];

        for (int i = 0; i < H + X; i++) {
            for (int j = 0; j < W + Y; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                B[i][j] = A[i][j] - B[i - X][j - Y];
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}