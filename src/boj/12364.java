import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int m = n % 3;
        
        if (m == 0) {
            System.out.println("0");
        } else {
            System.out.println(3 - m);
        }
        
        sc.close();
    }
}