import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while (n != 0) {
            int[][] arr = new int[n][n];
            int sum = 0;
            int[] rowSum = new int[n];
            int[] colSum = new int[n];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                    sum += arr[i][j];
                    rowSum[i] += arr[i][j];
                    colSum[j] += arr[i][j];
                }
            }
            
            System.out.print(sum + " ");
            
            for (int i = 0; i < n; i++) {
                System.out.print(rowSum[i] + " ");
            }
            
            for (int i = 0; i < n; i++) {
                System.out.print(colSum[i] + " ");
            }
            
            int maxRow = 0;
            int maxCol = 0;
            
            for (int i = 0; i < n; i++) {
                if (rowSum[i] > rowSum[maxRow]) {
                    maxRow = i;
                }
                if (colSum[i] > colSum[maxCol]) {
                    maxCol = i;
                }
            }
            
            System.out.println((maxRow + 1) + " " + (maxCol + 1));
            
            n = sc.nextInt();
        }
        
        sc.close();
    }
}