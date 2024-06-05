import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String word = sc.nextLine();
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            System.out.println(word + " " + count);
        }

        sc.close();
    }
}