import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int result = Math.min(N, M) * 2 - 1;
            System.out.println(result);
        }
        
        sc.close();
    }
}