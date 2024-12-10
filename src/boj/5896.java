import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            result += Integer.parseInt(str, 2);
        }
        
        System.out.println(result);
    }
}