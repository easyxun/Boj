import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            String s = sc.next();
            int length = s.length();
            boolean isPossible = true;

            while (length > 1) {
                int start = 0;
                int end = length - 1;
                boolean isPalindrome = true;

                while (start < end) {
                    if (s.charAt(start) != s.charAt(end)) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                if (isPalindrome) {
                    isPossible = false;
                    break;
                }

                s = s.substring(0, length - 1);
                length--;
            }

            if (isPossible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}