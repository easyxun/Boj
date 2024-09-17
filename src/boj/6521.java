import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a + b > c && b + c > a && a + c > b) {
                System.out.println("Scenario #" + i + ":");
                System.out.println("yes");
            } else {
                System.out.println("Scenario #" + i + ":");
                System.out.println("no");
            }
        }
        
        sc.close();
    }
}