import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            
            if (R % 2 == 1 && C % 2 == 1) {
                System.out.println("Gretel");
            } else {
                System.out.println("Hansel");
            }
        }
        
        sc.close();
    }
}