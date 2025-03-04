import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        boolean[][] visited = new boolean[n][n];
        boolean[][] lighted = new boolean[n][n];
        boolean[][] canTurnOn = new boolean[n][n];
        
        List<int[]>[][] switches = new List[n][n];
        
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            
            if (switches[x][y] == null) {
                switches[x][y] = new ArrayList<>();
            }
            switches[x][y].add(new int[]{a, b});
        }
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        visited[0][0] = true;
        lighted[0][0] = true;
        canTurnOn[0][0] = true;
        
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            if (switches[x][y] != null) {
                for (int[] s : switches[x][y]) {
                    int a = s[0];
                    int b = s[1];
                    
                    if (!lighted[a][b] && canTurnOn[a][b]) {
                        lighted[a][b] = true;
                        for (int k = 0; k < 4; k++) {
                            int nx = a + dx[k];
                            int ny = b + dy[k];
                            if (nx >= 0 && nx < n && ny >= 0 && ny < n && visited[nx][ny] && !lighted[nx][ny] && canTurnOn[nx][ny]) {
                                queue.add(new int[]{nx, ny});
                            }
                        }
                    }
                }
            }
            
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && lighted[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (lighted[i][j]) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}