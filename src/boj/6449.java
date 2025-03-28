import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = heights[i];
            for (int j = i; j < n; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                int area = minHeight * (j - i + 1);
                maxArea = Math.max(maxArea, area);
            }
        }

        System.out.println(maxArea);
    }
}