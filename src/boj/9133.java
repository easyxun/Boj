import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] words = sc.nextLine().split(" ");
            boolean valid = true;

            for (String word : words) {
                if (!isValidWord(word)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                System.out.println("Correct");
            } else {
                System.out.println("Misspell");
            }
        }
    }

    public static boolean isValidWord(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        for (char vowel : vowels) {
            if (word.contains(String.valueOf(vowel))) {
                return true;
            }
        }

        return false;
    }
}