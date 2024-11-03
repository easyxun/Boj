import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            double p = sc.nextDouble();
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            
            if (p == 0 && a == 0 && b == 0 && c == 0 && d == 0) {
                break;
            }
            
            double volume = p / (2 * (a + b)) * (a * a + b * b) * Math.PI;
            double height = p / (a + b) * c;
            double area = volume - (p * height);
            
            System.out.printf("%.2f\n", area);
        }
        
        sc.close();
    }
}