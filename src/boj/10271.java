import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            int[] diamonds = new int[N];
            for (int i = 0; i < N; i++) {
                diamonds[i] = sc.nextInt();
            }
            
            Arrays.sort(diamonds);
            
            int[] weights = new int[K];
            for (int i = 0; i < K; i++) {
                weights[i] = diamonds[N - 1 - i];
            }
            
            Arrays.sort(weights);
            
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < K; i++) {
                if (i % 2 == 0) {
                    sum1 += weights[i];
                } else {
                    sum2 += weights[i];
                }
            }
            
            System.out.println(Math.max(sum1, sum2));
        }
        
        sc.close();
    }
}