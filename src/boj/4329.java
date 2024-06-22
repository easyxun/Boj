import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            
            int count = 0;
            int current = 0;
            
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (num != current) {
                    count++;
                    current = num;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}