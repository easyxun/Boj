import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int t = 0; t < T; t++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            sc.nextLine();
            
            char[][] grid = new char[H][W];
            for (int i = 0; i < H; i++) {
                String row = sc.nextLine();
                for (int j = 0; j < W; j++) {
                    grid[i][j] = row.charAt(j);
                }
            }
            
            int count = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (grid[i][j] == '#') {
                        count++;
                        dfs(grid, i, j);
                    }
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
    
    public static void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '#') {
            return;
        }
        
        grid[i][j] = '.';
        
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}