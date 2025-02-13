import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] grid = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    int sum = 0;
                    if (i > 0) sum += grid[i-1][j];
                    if (i < n-1) sum += grid[i+1][j];
                    if (j > 0) sum += grid[i][j-1];
                    if (j < m-1) sum += grid[i][j+1];
                    
                    System.out.print(sum + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}