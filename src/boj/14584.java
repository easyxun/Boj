import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        String encrypted = sc.nextLine();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < words[j].length(); k++) {
                    char c = words[j].charAt(k);
                    if (c == ' ') {
                        System.out.print(" ");
                    } else {
                        char newChar = (char) ((c - 'a' + i) % 26 + 'a');
                        System.out.print(newChar);
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}