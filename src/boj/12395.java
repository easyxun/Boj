import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x > y) {
                System.out.println(">");
            } else if (x < y) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        }
        
        sc.close();
    }
}