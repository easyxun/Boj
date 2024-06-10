import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] s = new int[m];
        int[] e = new int[m];

        for (int i = 0; i < m; i++) {
            s[i] = sc.nextInt();
            e[i] = sc.nextInt();
        }

        int result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((start[i] <= s[j] && s[j] < end[i]) || (start[i] < e[j] && e[j] <= end[i])) {
                    result++;
                    break;
                }
            }
        }

        System.out.println(result);
    }
}