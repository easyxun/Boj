import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int result = 0;
        int left = 0;
        int right = n;

        while (left < right) {
            int mid = (left + right) / 2;
            if (isPossible(s, n, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        System.out.println(result);
    }

    public static boolean isPossible(String s, int n, int len) {
        return false; // 구현부분
    }
}