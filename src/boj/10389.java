import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int S = sc.nextInt();
            int E = sc.nextInt();
            int L = sc.nextInt();
            
            int[] time = new int[N+1];
            int[] cnt = new int[N+1];
            
            for (int j = 0; j < L; j++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                
                time[Y] = X;
                cnt[X]++;
            }
            
            int result = 0;
            for (int j = 1; j <= N; j++) {
                if (cnt[j] == 0) {
                    int cur = j;
                    int curTime = 0;
                    while (true) {
                        if (cur == E) {
                            result = curTime;
                            break;
                        }
                        cnt[cur] = -1;
                        curTime += time[cur];
                        cur = time[cur];
                    }
                }
            }
            
            System.out.println(result);
        }
    }
}