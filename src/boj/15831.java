import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int[] colors = new int[N];

        for (int i = 0; i < N; i++) {
            colors[i] = sc.next().equals("B") ? 1 : 0;
        }

        int max = 0;
        int left = 0;
        int right = 0;
        int bCount = 0;
        int wCount = 0;

        while (right < N) {
            if (colors[right] == 1) {
                bCount++;
            } else {
                wCount++;
            }

            while (bCount > B) {
                if (colors[left] == 1) {
                    bCount--;
                } else {
                    wCount--;
                }
                left++;
            }

            max = Math.max(max, wCount);

            right++;
        }

        System.out.println(max);
    }
}