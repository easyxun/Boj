import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (a == b) {
                System.out.println("0");
            } else if ((x + y) % 2 != (a + b) % 2 || Math.abs(x - a) == Math.abs(y - b)) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }
        
        sc.close();
    }
}