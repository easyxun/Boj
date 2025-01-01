import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            System.out.print(num + " ");
            for (int j = 1; j <= num; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}