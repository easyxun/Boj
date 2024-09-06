import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cows = new int[8];

        for (int i = 0; i < 8; i++) {
            cows[i] = sc.nextInt();
        }

        if (cows[0] == 1) {
            cows[0] = 2;
        } else {
            cows[0] = 1;
        }

        for (int i = 1; i < 8; i++) {
            if (cows[i] == 1) {
                cows[i] = 2;
            } else {
                cows[i] = 1;
            }
            if (cows[i - 1] == 2) {
                int temp = cows[i];
                cows[i] = cows[i - 1];
                cows[i - 1] = temp;
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(cows[i]);
        }
    }
}