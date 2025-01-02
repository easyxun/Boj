import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || digit == 1 || digit == 8) {
                count++;
            }
            n /= 10;
        }

        if (count == 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}