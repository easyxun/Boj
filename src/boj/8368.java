import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        int maxCount = 0;
        int maxNum = 0;
        
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > maxCount || (count == maxCount && nums[i] < maxNum)) {
                maxCount = count;
                maxNum = nums[i];
            }
        }
        
        System.out.println(maxNum);
        
        sc.close();
    }
}