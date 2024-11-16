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
            for (int i = n; i >= 1; i--) {
                if (i % 2 == 0) {
                    count += i * i;
                } else {
                    count -= i * i;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}