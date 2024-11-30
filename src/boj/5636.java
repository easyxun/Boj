import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] isPrime = new boolean[100001];
        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i * i <= 100000; i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= 100000; j += i) {
                    isPrime[j] = true;
                }
            }
        }

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            for (int i = n; i >= 2; i--) {
                if (!isPrime[i] && !isPrime[n - i]) {
                    System.out.println(n + " = " + (n - i) + " + " + i);
                    break;
                }
            }
        }
    }
}