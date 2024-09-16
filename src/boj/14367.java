import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String[] words = input.split(" ");
            StringBuilder sb = new StringBuilder();

            for (String word : words) {
                if (word.length() == 4) {
                    sb.append("**** ");
                } else {
                    sb.append(word).append(" ");
                }
            }

            System.out.println(sb.toString().trim());
        }

        sc.close();
    }
}