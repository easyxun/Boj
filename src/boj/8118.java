import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        int result = 0;
        int count = 0;
        
        while (count < k) {
            if (n >= 2 * m) {
                n--;
            } else {
                m--;
            }
            count++;
            result++;
        }
        
        System.out.println(result);
    }
}