import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            int count = 1;
            int height = 1;

            while (true) {
                if (height >= n) {
                    break;
                }

                height += count;
                count++;

                if (height >= n) {
                    count--;
                    break;
                }

                height -= count;
            }

            System.out.println(count);
        }

        sc.close();
    }
}