import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (ans[i] == count % 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}