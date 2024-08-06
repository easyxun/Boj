import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String s1 = sc.next();
            String s2 = sc.next();

            int count = 0;
            for (int j = 0; j < s1.length(); j++) {
                int diff = s2.charAt(j) - s1.charAt(j);
                if (diff < 0) {
                    diff += 26;
                }
                count += diff;
            }

            System.out.println(count);
        }

        sc.close();
    }
}