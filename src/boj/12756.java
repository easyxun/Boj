import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        while (a > 0 && b > 0) {
            a -= b;
            b -= a;
        }
        
        if (a <= 0 && b <= 0) {
            System.out.println("DRAW");
        } else if (a <= 0) {
            System.out.println("PLAYER B");
        } else {
            System.out.println("PLAYER A");
        }
    }
}