import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int sum = 0;
            for (int i = n-3; i >= 0; i -= 3) {
                sum += arr[i];
            }

            System.out.println(sum);
        }
    }
}