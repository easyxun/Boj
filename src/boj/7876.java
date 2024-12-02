import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            String str = sc.next();
            int count = 0;
            int result = 0;

            for (int j = 0; j < N; j++) {
                if (str.charAt(j) == 'c') {
                    count++;
                } else {
                    count = 0;
                }

                if (count >= 5) {
                    result++;
                    count = 0;
                }
            }

            System.out.println("Data Set " + i + ": " + result);
        }

        sc.close();
    }
}