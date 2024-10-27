import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            String str = sc.next();
            int len = str.length();
            
            for (int j = 0; j < len; j++) {
                System.out.print(str.substring(j) + str.substring(0, j) + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}