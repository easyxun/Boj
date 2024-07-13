import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();

        int total = (int) Math.pow(2, n);

        int quadrant = 0;
        if (x > total / 2) {
            quadrant += 2;
            x -= total / 2;
        }
        if (y > total / 2) {
            quadrant += 1;
            y -= total / 2;
        }

        if (n == 1) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < 4; i++) {
                if (i != quadrant) {
                    System.out.println((total / 2) * (total / 2) * i);
                } else {
                    System.out.println((total / 2) * (total / 2) * (i + 1) - 1);
                }
            }
        }
        
        sc.close();
    }
}