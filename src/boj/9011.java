import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String s = sc.next();
            StringBuilder result = new StringBuilder();
            int cur = 0;

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                int target = c - '0';

                while (cur < target) {
                    result.append("(");
                    cur++;
                }

                while (cur > target) {
                    result.append(")");
                    cur--;
                }

                result.append(c);
            }

            while (cur > 0) {
                result.append(")");
                cur--;
            }

            System.out.println("Case #" + (i + 1) + ": " + result.toString());
        }
    }
}