import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] left = new int[n+1];
        int[] right = new int[n+1];

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            left[i] = Math.max(left[i-1] + x, right[i-1] + Math.max(x-1, y));
            right[i] = Math.max(right[i-1] + y, left[i-1] + Math.max(y-1, x));
        }

        System.out.println(Math.max(left[n], right[n]));
    }
}