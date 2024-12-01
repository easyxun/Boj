import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        Arrays.sort(arr);
        
        int target = (sum + 1) / 2;
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            if (target >= arr[i]) {
                target -= arr[i];
                result++;
            } else {
                break;
            }
        }
        
        System.out.println(result);
        
        sc.close();
    }
}