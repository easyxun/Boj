import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            double length = sc.nextDouble();
            double width = sc.nextDouble();
            double depth = sc.nextDouble();
            double weight = sc.nextDouble();
            
            if ((length <= 56 && width <= 45 && depth <= 25) || (length + width + depth <= 125)) {
                if (weight <= 7) {
                    System.out.println("1");
                    count++;
                } else {
                    System.out.println("0");
                }
            } else {
                System.out.println("0");
            }
        }
        
        System.out.println(count);
    }
}