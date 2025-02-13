import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            if (n == 0 && m == 0) {
                break;
            }
            
            int count = 0;
            for (int i = n; i <= m; i++) {
                if (isPalindrome(i)) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
    
    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}