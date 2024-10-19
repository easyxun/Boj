import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[][] matrix = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            int Q = sc.nextInt();
            for (int q = 1; q <= Q; q++) {
                String operation = sc.next();
                int x = sc.nextInt();
                int y = sc.nextInt();

                if (operation.equals("row")) {
                    for (int j = 0; j < N; j++) {
                        System.out.print(matrix[x-1][j] + " ");
                    }
                    System.out.println();
                } else if (operation.equals("col")) {
                    for (int i = 0; i < N; i++) {
                        System.out.println(matrix[i][y-1]);
                    }
                } else if (operation.equals("inc")) {
                    for (int i = 0; i < N; i++) {
                        for (int j = 0; j < N; j++) {
                            matrix[i][j] = (matrix[i][j] + 1) % 10;
                        }
                    }
                } else if (operation.equals("dec")) {
                    for (int i = 0; i < N; i++) {
                        for (int j = 0; j < N; j++) {
                            matrix[i][j] = (matrix[i][j] + 9) % 10;
                        }
                    }
                } else if (operation.equals("transpose")) {
                    int[][] temp = new int[N][N];
                    for (int i = 0; i < N; i++) {
                        for (int j = 0; j < N; j++) {
                            temp[j][i] = matrix[i][j];
                        }
                    }
                    matrix = temp;
                }
            }
        }
    }
}