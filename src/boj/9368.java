import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] map = new int[N][M];
            for (int i = 0; i < N; i++) {
                String row = sc.next();
                for (int j = 0; j < M; j++) {
                    map[i][j] = row.charAt(j) - 'A';
                }
            }

            int[] dx = {1, -1, 0, 0};
            int[] dy = {0, 0, 1, -1};

            boolean[] visited = new boolean[26];
            int result = 0;

            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[]{0, 0, 1 << map[0][0]});
            visited[map[0][0]] = true;

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                int bitMask = current[2];

                result = Math.max(result, Integer.bitCount(bitMask));

                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[map[nx][ny]]) {
                        visited[map[nx][ny]] = true;
                        queue.offer(new int[]{nx, ny, bitMask | (1 << map[nx][ny])});
                    }
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}