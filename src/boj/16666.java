import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        
        if (d == 0) {
            System.out.println("0.000000");
        } else {
            System.out.printf("%.6f%n", c / d);
        }
        
        sc.close();
    }
}