import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        int[] index = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dp[0] = arr[0];
        stack.push(arr[0]);

        for (int i = 1; i < n; i++) {
            if (stack.peek() < arr[i]) {
                stack.push(arr[i]);
                dp[i] = stack.size() - 1;
            } else {
                int idx = lowerBound(stack, arr[i]);
                stack.set(idx, arr[i]);
                dp[i] = idx;
            }
        }

        System.out.println(stack.size());
        Stack<Integer> result = new Stack<>();
        int len = stack.size() - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (dp[i] == len) {
                result.push(arr[i]);
                len--;
            }
        }

        while (!result.isEmpty()) {
            System.out.print(result.pop() + " ");
        }
    }

    public static int lowerBound(Stack<Integer> stack, int num) {
        int left = 0;
        int right = stack.size() - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (stack.get(mid) >= num) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return right;
    }
}