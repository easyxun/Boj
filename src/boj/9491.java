import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int a = sc.nextInt();
            int m = sc.nextInt();
            
            if (a == 0 && m == 0) {
                break;
            }
            
            int result = 1;
            int count = 1;
            int current = a;
            
            while (current != 1) {
                current = (current * a) % m;
                count++;
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}