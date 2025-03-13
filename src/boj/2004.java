import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long count5 = getCount(n, 5) - getCount(m, 5) - getCount(n - m, 5);
        long count2 = getCount(n, 2) - getCount(m, 2) - getCount(n - m, 2);

        System.out.println(Math.min(count5, count2));
    }

    public static long getCount(long num, int div) {
        long count = 0;
        for (long i = div; i <= num; i *= div) {
            count += num / i;
        }
        return count;
    }
}