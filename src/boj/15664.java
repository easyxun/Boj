import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    static Set<String> set = new LinkedHashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N];
        result = new int[M];
        visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        dfs(0, 0);

        for (String s : set) {
            System.out.println(s);
        }
    }

    static void dfs(int depth, int start) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(result[i] + " ");
            }
            set.add(sb.toString().trim());
            return;
        }

        for (int i = start; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                dfs(depth + 1, i + 1);
                visited[i] = false;
            }
        }
    }
}