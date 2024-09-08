import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        long q = sc.nextLong();
        long x = sc.nextLong();
        long y;

        Map<Long, Long> memo = new HashMap<>();
        System.out.println(dfs(n, p, q, x, memo));
    }

    public static long dfs(long n, long p, long q, long x, Map<Long, Long> memo) {
        if (n == 0) {
            return 1;
        }

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        long result = dfs(n / p - x, p, q, x, memo) + dfs(n / q - x, p, q, x, memo);
        memo.put(n, result);

        return result;
    }
}