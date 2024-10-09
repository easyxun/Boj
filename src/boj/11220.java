import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= t; i++) {
            String line = sc.nextLine();
            String[] words = line.split(" ");

            System.out.print("Case #" + i + ": ");
            for (String word : words) {
                char c = word.charAt(0);
                int diff = c - 'a' + 1;
                if (diff <= words.length) {
                    System.out.print(word.charAt(diff - 1));
                }
            }
            System.out.println();
        }
    }
}