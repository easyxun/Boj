import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int sum = 0;
            
            for (int j = 0; j < n; j++) {
                sum += sc.nextInt();
            }
            
            int m = sc.nextInt();
            if (sum <= m) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}