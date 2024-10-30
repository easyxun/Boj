import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            long reversedNum = 0;

            while (num != 0) {
                reversedNum = reversedNum * 10 + num % 10;
                num /= 10;
            }

            System.out.println(reversedNum);
        }

        sc.close();
    }
}