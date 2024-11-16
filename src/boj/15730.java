import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] blocks = new int[n];
        
        for (int i = 0; i < n; i++) {
            blocks[i] = sc.nextInt();
        }
        
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (blocks[i] > blocks[i-1]) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}