import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            System.out.println(s.charAt(0) - 'A' + 1 + " " + (s.charAt(1) - 'A' + 1));
        }
        
        sc.close();
    }
}