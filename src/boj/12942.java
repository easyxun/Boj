import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int result = calculateMinCost(arr, 1, n);
        System.out.println(result);
    }
    
    public static int calculateMinCost(int[] arr, int start, int end) {
        if (start == end) {
            return 0;
        }
        
        int minCost = Integer.MAX_VALUE;
        for (int i = start; i < end; i++) {
            int cost = calculateMinCost(arr, start, i) + calculateMinCost(arr, i+1, end) + arr[start-1] * arr[i] * arr[end];
            minCost = Math.min(minCost, cost);
        }
        
        return minCost;
    }
}