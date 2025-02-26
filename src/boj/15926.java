import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String cards = sc.next();

        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (cards.charAt(i) == 'I') {
                count++;
                max = Math.max(max, count);
            } else {
                count--;
            }
        }

        System.out.println(max);
    }
}