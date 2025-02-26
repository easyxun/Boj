import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] trust = new int[N+1];
        boolean[] isTrusted = new boolean[N+1];
        
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            trust[a]++;
            trust[b]++;
            isTrusted[a] = true;
            isTrusted[b] = true;
        }
        
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (!isTrusted[i]) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}