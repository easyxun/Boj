import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> Long.compare(b, a));

            for (int j = 0; j < k; j++) {
                pq.offer(sc.nextLong());
            }

            long result = 0;
            while (pq.size() > 1) {
                long sum = pq.poll() + pq.poll();
                result += sum;
                pq.offer(sum);
            }

            System.out.println(result);
        }
    }
}