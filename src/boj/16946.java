import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][m];
        int[][] answer = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                map[i][j] = line.charAt(j) - '0';
                answer[i][j] = map[i][j];
            }
        }
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    Queue<int[]> queue = new LinkedList<>();
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                    
                    int count = 1;
                    Set<String> set = new HashSet<>();
                    
                    while (!queue.isEmpty()) {
                        int[] cur = queue.poll();
                        int x = cur[0];
                        int y = cur[1];
                        
                        for (int k = 0; k < 4; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];
                            
                            if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] == 0 && !visited[nx][ny]) {
                                queue.offer(new int[]{nx, ny});
                                visited[nx][ny] = true;
                                count++;
                            }
                        }
                        
                        for (int k = 0; k < 4; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];
                            
                            if (nx >= 0 && nx < n && ny >= 0 && ny < m && map[nx][ny] == 1) {
                                set.add(nx + " " + ny);
                            }
                        }
                    }
                    
                    for (String s : set) {
                        String[] pos = s.split(" ");
                        int x = Integer.parseInt(pos[0]);
                        int y = Integer.parseInt(pos[1]);
                        
                        answer[x][y] = (answer[x][y] + count) % 10;
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
        
        sc.close();
    }
}