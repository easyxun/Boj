import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        if (sum % 2 == 0) {
            System.out.println(sum / 2);
        } else {
            System.out.println((sum / 2) + 1);
        }
        
        sc.close();
    }
}