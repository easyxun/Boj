import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                sum += sc.nextInt();
            }
            
            System.out.println("Scenario #" + i + ":");
            if (sum <= M) {
                System.out.println("possible");
            } else {
                System.out.println("impossible");
            }
            System.out.println();
        }
        
        sc.close();
    }
}