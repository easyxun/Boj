import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();
        int P = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            B[i] = sc.nextInt();
        }

        int totalStones = K * N;
        int totalStonesPerHour = S * M;

        int totalStonesNeeded = totalStones / P;
        if (totalStones % P != 0) {
            totalStonesNeeded++;
        }

        int hoursNeeded = totalStonesNeeded / totalStonesPerHour;
        if (totalStonesNeeded % totalStonesPerHour != 0) {
            hoursNeeded++;
        }

        System.out.println(hoursNeeded);
    }
}