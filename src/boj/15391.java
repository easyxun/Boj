import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String s = sc.next();
        
        for (int i = 0; i < n*m; i++) {
            System.out.print(s.charAt(i));
            if ((i+1) % m == 0) {
                System.out.println();
            }
        }
        
        sc.close();
    }
}