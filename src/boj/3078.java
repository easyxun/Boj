import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        
        sc.nextLine(); // Consume newline character
        
        Map<Integer, Queue<Integer>> map = new HashMap<>();
        long count = 0;
        
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int len = name.length();
            
            if (!map.containsKey(len)) {
                map.put(len, new LinkedList<>());
            }
            
            Queue<Integer> queue = map.get(len);
            
            while (!queue.isEmpty() && i - queue.peek() > k) {
                queue.poll();
            }
            
            count += queue.size();
            queue.offer(i);
        }
        
        System.out.println(count);
    }
}