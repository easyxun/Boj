import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        long total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i] * (n - i);
        }

        System.out.println(total);
    }
}