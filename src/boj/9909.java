import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        while (n != 0 && m != 0) {
            if (isPalindrome(n) && isPalindrome(m)) {
                System.out.println(n + m);
            } else {
                System.out.println("No");
            }

            n = sc.nextInt();
            m = sc.nextInt();
        }
    }

    public static boolean isPalindrome(int num) {
        String strNum = String.valueOf(num);
        int len = strNum.length();

        for (int i = 0; i < len / 2; i++) {
            if (strNum.charAt(i) != strNum.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }
}