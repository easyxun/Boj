import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            if (n == 0 && m == 0) {
                break;
            }
            
            int result = 0;
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    result += (n - i) * (m - j);
                }
            }
            
            System.out.println(result);
        }
        
        sc.close();
    }
}