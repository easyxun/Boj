import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String t = sc.next();
            String p = sc.next();

            if (isPossible(s, t, p)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isPossible(String s, String t, String p) {
        int[] countS = new int[26];
        int[] countT = new int[26];

        for (char c : s.toCharArray()) {
            countS[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            countT[c - 'a']++;
        }

        for (char c : p.toCharArray()) {
            countS[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (countS[i] < countT[i]) {
                return false;
            }
        }

        return true;
    }
}