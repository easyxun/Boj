import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int D = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] restStops = new int[N+2];
        restStops[0] = 0;
        restStops[N+1] = D;
        
        for (int i = 1; i <= N; i++) {
            restStops[i] = sc.nextInt();
        }
        
        int left = 0;
        int right = D;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 0;
            
            for (int i = 1; i < restStops.length; i++) {
                cnt += (restStops[i] - restStops[i-1] - 1) / mid;
            }
            
            if (cnt > M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        System.out.println(right);
    }
}