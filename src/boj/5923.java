import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int sum = a + b + c;
        
        if (sum % 2 == 0) {
            System.out.println(sum / 2);
        } else {
            System.out.println("NO");
        }
    }
}