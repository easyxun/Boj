import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            long N = sc.nextLong();
            long S1 = N * (N + 1) / 2;
            long S2 = N * N;
            long S3 = N * (N + 1);
            
            System.out.println(i + " " + S1 + " " + S2 + " " + S3);
        }

        sc.close();
    }
}