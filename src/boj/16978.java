import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int type = sc.nextInt();
            int start = sc.nextInt();
            int end = sc.nextInt();
            int value = sc.nextInt();

            if (type == 1) {
                for (int j = start; j <= end; j++) {
                    arr[j] += value;
                }
            } else {
                long sum = 0;
                for (int j = start; j <= end; j++) {
                    sum += arr[j];
                }
                System.out.println(sum);
            }
        }
        
        sc.close();
    }
}