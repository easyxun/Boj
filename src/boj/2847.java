import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        
        int count = 0;
        
        for (int i = n - 2; i >= 0; i--) {
            if (scores[i] >= scores[i + 1]) {
                count += scores[i] - scores[i + 1] + 1;
                scores[i] = scores[i + 1] - 1;
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }
}