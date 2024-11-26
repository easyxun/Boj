import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            int max = Math.max(A, Math.max(B, C));
            int min = Math.min(A, Math.min(B, C));
            int mid = A + B + C - max - min;
            
            System.out.println("Case #" + (i + 1) + ": " + mid);
        }
        
        sc.close();
    }
}