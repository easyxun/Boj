import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String num = sc.next();
            if (isPalindrome(num)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean isPalindrome(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}