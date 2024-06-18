import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int C = sc.nextInt();
        
        char[][] map = new char[R][C];
        int[][] time = new int[R][C];
        
        for (int i = 0; i < R; i++) {
            String input = sc.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = input.charAt(j);
                if (map[i][j] == 'J') {
                    time[i][j] = 0;
                } else if (map[i][j] == 'F') {
                    time[i][j] = -1;
                }
            }
        }
        
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (map[i][j] == 'F') {
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        
                        if (nx >= 0 && nx < R && ny >= 0 && ny < C && map[nx][ny] != '#' && time[nx][ny] == 0) {
                            time[nx][ny] = 1;
                        }
                    }
                }
            }
        }
        
        int result = -1;
        boolean flag = false;
        
        while (true) {
            flag = false;
            for (int i = 0; i < R; i++) {
                for (int j = 0; j < C; j++) {
                    if (map[i][j] == 'J' && time[i][j] == result) {
                        for (int k = 0; k < 4; k++) {
                            int nx = i + dx[k];
                            int ny = j + dy[k];
                            
                            if (nx < 0 || nx >= R || ny < 0 || ny >= C) {
                                System.out.println(result + 1);
                                return;
                            }
                            
                            if (map[nx][ny] == '.' && time[nx][ny] == 0) {
                                time[nx][ny] = result + 1;
                                flag = true;
                            }
                        }
                    }
                }
            }
            
            if (!flag) {
                break;
            }
            
            result++;
        }
        
        System.out.println("IMPOSSIBLE");
    }
}