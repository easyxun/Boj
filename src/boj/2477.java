import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int K = sc.nextInt();
        int[] arr = new int[6];
        int maxW = 0, maxH = 0;
        
        for (int i = 0; i < 6; i++) {
            sc.nextInt();
            arr[i] = sc.nextInt();
            maxW = Math.max(maxW, arr[i]);
            maxH = Math.max(maxH, arr[i]);
        }
        
        int totalArea = maxW * maxH;
        int cutArea = 0;
        
        for (int i = 0; i < 6; i++) {
            int nextIdx = (i + 1) % 6;
            cutArea = Math.max(cutArea, arr[i] * arr[nextIdx]);
        }
        
        int result = (totalArea - cutArea) * K;
        System.out.println(result);
    }
}