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
            
            int sum = a * a + b * b;
            
            if (sum == c * c) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        
        sc.close();
    }
}