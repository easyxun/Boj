import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, q;
        
        while (true) {
            n = sc.nextInt();
            q = sc.nextInt();
            
            if (n == 0 && q == 0) {
                break;
            }
            
            int[] arr = new int[n+1];
            arr[0] = 0;
            
            for (int i = 1; i <= n; i++) {
                arr[i] = i;
            }
            
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int x = sc.nextInt();
                
                for (int j = l; j <= r; j++) {
                    if (arr[j] < x) {
                        System.out.print(arr[j] + " ");
                    }
                }
                
                System.out.println();
            }
            
            System.out.println("-");
        }
        
        sc.close();
    }
}