import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if (n == 0 && m == 0) {
            System.out.println("Not a moose");
        } else if (n == m) {
            System.out.println("Even " + n * 2);
        } else {
            System.out.println("Odd " + Math.max(n, m) * 2);
        }
        
        sc.close();
    }
}