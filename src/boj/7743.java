import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int result = 1;
        for (int i = 0; i < m; i++) {
            result *= n - i;
        }
        
        System.out.println(result);
    }
}