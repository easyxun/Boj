import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            int result = 1;
            
            for (int j = 1; j <= num; j++) {
                result *= j;
            }
            
            System.out.println(result);
        }
        
        sc.close();
    }
}