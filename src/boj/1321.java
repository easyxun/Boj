import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N+1];
        
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int query = sc.nextInt();
            if (query == 1) {
                int idx = sc.nextInt();
                int val = sc.nextInt();
                arr[idx] += val;
            } else {
                int idx = sc.nextInt();
                int sum = 0;
                for (int j = 1; j <= idx; j++) {
                    sum += arr[j];
                }
                System.out.println(sum);
            }
        }
    }
}