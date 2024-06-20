import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] parent = new int[n+1];
        List<List<Integer>> children = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            children.add(new ArrayList<>());
        }

        for (int i = 2; i <= n; i++) {
            parent[i] = sc.nextInt();
            children.get(parent[i]).add(i);
        }

        int[] dp = new int[n+1];
        while (m-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                int idx = sc.nextInt();
                System.out.println(dp[idx]);
            } else {
                int idx = sc.nextInt();
                int w = sc.nextInt();
                update(idx, w, dp, children);
            }
        }
    }

    public static void update(int idx, int w, int[] dp, List<List<Integer>> children) {
        dp[idx] += w;
        for (int child : children.get(idx)) {
            update(child, w, dp, children);
        }
    }
}