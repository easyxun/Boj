import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if ((x + y) % 2 == 0) {
            System.out.println((x + y) / 2);
        } else {
            System.out.println((x + y + z) / 2);
        }

        sc.close();
    }
}