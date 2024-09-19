import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int[] count = new int[26];
        int left = 0, right = 0, max = 0, result = 0;

        while (right < str.length()) {
            char c = str.charAt(right);
            count[c - 'a']++;

            while (count[c - 'a'] > N) {
                char leftChar = str.charAt(left);
                count[leftChar - 'a']--;
                left++;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }

        System.out.println(max);
    }
}