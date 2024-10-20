import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int x = (N-1) / M;
            int y = (N-1) % M;
            
            System.out.println("Case #" + i + ": " + (M*y + x + 1) + " " + (M*x + y + 1));
        }
        
        sc.close();
    }
}