import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] abilities = new double[11];
        for (int i = 0; i < 11; i++) {
            abilities[i] = sc.nextDouble();
        }
        
        double total = abilities[0];
        for (int i = 1; i < 11; i++) {
            total += abilities[i];
        }
        
        System.out.printf("%.0f\n", total);
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.0f\n", total * (abilities[i] / 100));
        }
        
        sc.close();
    }
}