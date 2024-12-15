import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));
            
            System.out.println("Case " + (i+1) + ": " + (a+b+c-max-min));
        }
        
        sc.close();
    }
}