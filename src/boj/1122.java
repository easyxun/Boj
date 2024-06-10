import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long x = sc.nextLong();
        long y = sc.nextLong();
        
        if (x == 0 && y == 0) {
            System.out.println("Not a moose");
        } else if (x == y) {
            System.out.println("Even " + x * 2);
        } else {
            System.out.println("Odd " + Math.max(x, y) * 2);
        }
        
        sc.close();
    }
}