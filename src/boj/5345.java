import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            long sum = 0;
            for (int j = 0; j < M; j++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                sum += (long) a * b;
            }
            
            System.out.println(N + " " + sum);
        }
        
        sc.close();
    }
}