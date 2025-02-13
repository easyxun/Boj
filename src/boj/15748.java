import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        int P = sc.nextInt();
        
        int maxArea = 0;
        
        for (int i = 0; i <= N; i++) {
            int area = A * i + C * Math.max(0, (N - i) / P);
            maxArea = Math.max(maxArea, area);
        }
        
        System.out.println(maxArea);
    }
}