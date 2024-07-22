import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        
        Arrays.sort(heights);
        
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += heights[i+1] - heights[i];
        }
        
        System.out.println(sum);
    }
}