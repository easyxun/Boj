import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        int result = Math.min(N, M/2) - Math.max(0, (N + M - K) / 3);
        
        System.out.println(result);
        
        sc.close();
    }
}