import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while (n != 0) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
            
            n = sc.nextInt();
        }
        
        sc.close();
    }
}