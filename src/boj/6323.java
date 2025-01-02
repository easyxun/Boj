import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            System.out.println("Scenario #" + i + ":");
            System.out.println((1 + num) * num / 2);
            System.out.println();
        }
        
        sc.close();
    }
}