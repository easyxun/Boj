import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (a % 2 == 0 || b % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        sc.close();
    }
}