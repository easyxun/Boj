import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int len = s.length();
            int sum = 0;
            
            for (int j = 0; j < len; j++) {
                sum += s.charAt(j) - '0';
            }
            
            System.out.println(sum);
        }
        
        sc.close();
    }
}