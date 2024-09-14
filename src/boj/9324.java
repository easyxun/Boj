import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            String str = sc.next();
            if (isValid(str)) {
                System.out.println("OK");
            } else {
                System.out.println("FAKE");
            }
        }
    }

    public static boolean isValid(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] % 3 != 0) {
                return false;
            }
        }

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                return false;
            }
        }

        return true;
    }
}