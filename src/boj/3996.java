import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String result = processString(str);
            System.out.println(result);
        }

        sc.close();
    }

    public static String processString(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                sb.append(' ');
            } else {
                sb.append((char) ('a' + ('z' - c)));
            }
        }

        return sb.toString();
    }
}