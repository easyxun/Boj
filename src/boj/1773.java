import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();

        boolean[] fireworks = new boolean[C + 1];

        for (int i = 0; i < N; i++) {
            int interval = sc.nextInt();
            for (int j = interval; j <= C; j += interval) {
                fireworks[j] = true;
            }
        }

        int count = 0;
        for (int i = 1; i <= C; i++) {
            if (fireworks[i]) {
                count++;
            }
        }

        System.out.println(count);
    }
}