import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();

        int answer = 0;

        for (int i = 0; i <= N / 2; i++) {
            int j = N - i;
            int count1 = getChocolateCount(H, W, i);
            int count2 = getChocolateCount(H, W, j);
            answer = Math.max(answer, count1 + count2);
        }

        System.out.println(answer);
    }

    public static int getChocolateCount(int H, int W, int n) {
        if (H >= n && W >= n) {
            return H * W - n * (H / n) * (W / n);
        } else {
            return 0;
        }
    }
}