import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[256];

        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            count[c]++;
        }

        for (int i = 'A'; i <= 'Z'; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + " " + count[i]);
            }
        }

        for (int i = 'a'; i <= 'z'; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + " " + count[i]);
            }
        }
    }
}