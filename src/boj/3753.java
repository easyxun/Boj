import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            
            Arrays.sort(arr);
            
            int rank = 1;
            int[] ranks = new int[n];
            ranks[0] = rank;
            for (int j = 1; j < n; j++) {
                if (arr[j] == arr[j-1]) {
                    ranks[j] = rank;
                } else {
                    rank++;
                    ranks[j] = rank;
                }
            }
            
            for (int j = 0; j < n; j++) {
                System.out.print(ranks[j] + " ");
            }
            System.out.println();
        }
    }
}