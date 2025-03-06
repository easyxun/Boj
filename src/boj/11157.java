import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int D = sc.nextInt();
            int maxJump = 0;
            
            int prevPos = 0;
            for (int i = 0; i < N; i++) {
                int currentPos = sc.nextInt();
                if (currentPos - prevPos > maxJump) {
                    maxJump = currentPos - prevPos;
                }
                prevPos = currentPos;
            }
            
            if (D - prevPos > maxJump) {
                maxJump = D - prevPos;
            }
            
            System.out.println("Case " + t + ": " + maxJump);
        }
        
        sc.close();
    }
}