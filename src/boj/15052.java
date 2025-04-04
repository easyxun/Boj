import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 1) {
                    System.out.print("#");
                } else {
                    if (i % 4 == 0 && j == 1) {
                        System.out.print("#");
                    } else if (i % 4 == 2 && j == m) {
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}