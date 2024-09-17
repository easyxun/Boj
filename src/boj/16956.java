import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] map = new char[R][C];

        for (int i = 0; i < R; i++) {
            String row = sc.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = row.charAt(j);
            }
        }

        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        boolean isPossible = true;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'W') {
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                            if (map[nx][ny] == 'S') {
                                isPossible = false;
                                break;
                            } else if (map[nx][ny] == '.') {
                                map[nx][ny] = 'D';
                            }
                        }
                    }
                }
            }
        }

        if (isPossible) {
            System.out.println(1);
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    System.out.print(map[i][j]);
                }
                System.out.println();
            }
        } else {
            System.out.println(0);
        }
    }
}