import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (maxHeap.size() == minHeap.size()) {
                maxHeap.offer(num);
            } else {
                minHeap.offer(num);
            }

            if (!maxHeap.isEmpty() && !minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                int maxTop = maxHeap.poll();
                int minTop = minHeap.poll();

                maxHeap.offer(minTop);
                minHeap.offer(maxTop);
            }

            System.out.println(maxHeap.peek());
        }
    }
}