import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            
            if (discriminant > 0) {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two distinct roots x1=" + String.format("%.6f", x1) + " , x2=" + String.format("%.6f", x2));
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                System.out.println("One real root x=" + String.format("%.6f", x));
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
                System.out.println("Two complex roots x1=" + String.format("%.6f", realPart) + "+" + String.format("%.6f", imaginaryPart) + "i , x2=" + String.format("%.6f", realPart) + "-" + String.format("%.6f", imaginaryPart) + "i");
            }
        }
        
        sc.close();
    }
}