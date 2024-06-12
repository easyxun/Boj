import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            int sum = 0;
            
            for (int j = 1; j <= num; j++) {
                if (j % 3 == 0 || j % 5 == 0) {
                    sum += j;
                }
            }
            
            System.out.println(sum);
        }
        
        sc.close();
    }
}