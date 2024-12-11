import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int count = 0;
        int result = 0;

        for (int i = 1; i <= B; i++) {
            if ((i % A) == 0) {
                count++;
                result = i;
            }
        }

        if (count == 1) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}