import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            
            int result = a / (b + c) * b + Math.min(a % (b + c), b);
            System.out.println(result);
        }
        
        sc.close();
    }
}