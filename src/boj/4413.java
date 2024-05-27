import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while (n != 0) {
            int[] arr = new int[n];
            boolean[] visited = new boolean[n];
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    int next = (i + arr[i]) % n;
                    while (!visited[next]) {
                        visited[next] = true;
                        next = (next + arr[next]) % n;
                    }
                    count++;
                }
            }
            
            System.out.println(count);
            n = sc.nextInt();
        }
        
        sc.close();
    }
}