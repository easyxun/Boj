import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        if (n == 0 && m == 0) {
            System.out.println(0);
        } else if (n == 1 && m == 1) {
            System.out.println(2);
        } else {
            System.out.println(n + m - 1);
        }
        
        sc.close();
    }
}