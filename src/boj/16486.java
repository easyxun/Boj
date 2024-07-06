import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        
        double result = 2 * (d1 + 3.141592 * d2);
        
        System.out.println(result);
        
        sc.close();
    }
}