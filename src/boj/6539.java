import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                sum += num;
                if (sum % n == 0) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}