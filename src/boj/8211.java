import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            long C = scanner.nextLong();
            
            if (A == B && B == C) {
                System.out.println(1);
            } else if (A != B && B != C && A != C) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }
        }
        
        scanner.close();
    }
}