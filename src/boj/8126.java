import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        if (k == 0) {
            System.out.println(n);
        } else {
            int result = n / k;
            System.out.println(result);
        }
        
        sc.close();
    }
}