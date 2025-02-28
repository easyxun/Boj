import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            sc.nextLine();

            long result = 1;
            for (int j = 0; j < N; j++) {
                String[] input = sc.nextLine().split(" ");
                long a = Long.parseLong(input[0]);
                long b = Long.parseLong(input[1]);

                result = (result * (a % 1000000007) % 1000000007 * b % 1000000007) % 1000000007;
            }

            System.out.println(result);
        }

        sc.close();
    }
}