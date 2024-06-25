import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        int left = 0, right = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == '.') {
                    cnt++;
                }
            }

            if (cnt < min) {
                min = cnt;
                left = 0;
                right = 0;
            }

            if (cnt == min) {
                int l = 0, r = 0;
                for (int j = 0; j < i; j++) {
                    if (arr[j].charAt(0) == '.') {
                        l++;
                    }
                }

                for (int j = i + 1; j < n; j++) {
                    if (arr[j].charAt(0) == '.') {
                        r++;
                    }
                }

                if (l <= r) {
                    left = l;
                    right = r;
                }
            }
        }

        System.out.println((left + right));
    }
}