import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        int[][] growth = new int[M][M];
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                growth[i][j] = 1;
            }
        }
        
        for (int i = 0; i < N; i++) {
            int zero = sc.nextInt();
            int one = sc.nextInt();
            int two = sc.nextInt();
            
            for (int j = 0; j < M; j++) {
                if (zero > 0) {
                    growth[j][0]++;
                    zero--;
                } else if (one > 0) {
                    growth[j][1]++;
                    one--;
                } else if (two > 0) {
                    growth[j][2]++;
                    two--;
                }
            }
        }
        
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (j == 0) {
                    System.out.print(growth[i][j]);
                } else {
                    System.out.print(" " + growth[i][j]);
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}