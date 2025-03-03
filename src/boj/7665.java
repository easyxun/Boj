import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int n = sc.nextInt();
            int[] parents = new int[n + 1];
            Arrays.fill(parents, -1);
            boolean isValid = true;
            
            for (int i = 0; i < n; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                
                if (parents[u] == -1 && parents[v] == -1) {
                    parents[u] = v;
                    parents[v] = u;
                } else if (parents[u] != v || parents[v] != u) {
                    isValid = false;
                }
            }
            
            System.out.println("Scenario #" + t + ":");
            System.out.println(isValid ? "No suspicious bugs found!" : "Suspicious bugs found!");
        }
    }
}