import java.util.*;

public class Main {
    static long[] arr;
    static long[] tree;
    static long MOD = 1000000007;

    public static void init(int node, int start, int end) {
        if (start == end) {
            tree[node] = arr[start] % MOD;
        } else {
            int mid = (start + end) / 2;
            init(node * 2, start, mid);
            init(node * 2 + 1, mid + 1, end);
            tree[node] = (tree[node * 2] * tree[node * 2 + 1]) % MOD;
        }
    }

    public static long multiply(int node, int start, int end, int left, int right) {
        if (left > end || right < start) {
            return 1;
        }
        if (left <= start && end <= right) {
            return tree[node];
        }
        int mid = (start + end) / 2;
        return (multiply(node * 2, start, mid, left, right) * multiply(node * 2 + 1, mid + 1, end, left, right)) % MOD;
    }

    public static void update(int node, int start, int end, int index, long newValue) {
        if (index < start || index > end) {
            return;
        }
        if (start == end) {
            tree[node] = newValue % MOD;
        } else {
            int mid = (start + end) / 2;
            update(node * 2, start, mid, index, newValue);
            update(node * 2 + 1, mid + 1, end, index, newValue);
            tree[node] = (tree[node * 2] * tree[node * 2 + 1]) % MOD;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        arr = new long[N];
        tree = new long[4 * N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        init(1, 0, N - 1);

        for (int i = 0; i < M + K; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long c = sc.nextLong();

            if (a == 1) {
                update(1, 0, N - 1, b - 1, c);
            } else if (a == 2) {
                System.out.println(multiply(1, 0, N - 1, b - 1, (int) c - 1));
            }
        }
    }
}