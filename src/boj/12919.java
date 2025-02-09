import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();

        while (T.length() > S.length()) {
            if (T.charAt(T.length() - 1) == 'A') {
                T = T.substring(0, T.length() - 1);
            } else {
                T = new StringBuilder(T.substring(0, T.length() - 1)).reverse().toString();
            }
        }

        if (S.equals(T)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}