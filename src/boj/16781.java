import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        int[] friends = new int[N+1];
        
        for (int i = 1; i <= N; i++) {
            friends[i] = sc.nextInt();
        }
        
        int max = 0;
        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int j = 1; j <= N; j++) {
                if (friends[i] == friends[j]) {
                    count++;
                }
            }
            if (count >= M + K) {
                max++;
            }
        }
        
        System.out.println(max);
    }
}