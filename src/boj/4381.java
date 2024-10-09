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
            int result = n;
            while (result >= 10) {
                int temp = result;
                result = 1;
                while (temp > 0) {
                    result *= temp % 10;
                    temp /= 10;
                }
                count++;
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}