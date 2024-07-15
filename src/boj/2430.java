import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long max = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            sum += num;
            if (num > max) {
                max = num;
            }
        }

        long result = Math.max(max, sum / n);
        System.out.println(result);
    }
}