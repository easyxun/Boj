import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        double x = (a * b * c) / (Math.sqrt(a * a + b * b + c * c));
        
        System.out.println(x);
        
        sc.close();
    }
}