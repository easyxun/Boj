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
            
            int count = 0;
            while (n < m) {
                n *= 2;
                count++;
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}