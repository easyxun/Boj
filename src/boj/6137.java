import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }
        
        int left = 0, right = n - 1;
        StringBuilder sb = new StringBuilder();
        
        while (left <= right) {
            boolean leftSmaller = false;
            for (int i = 0; left + i <= right; i++) {
                if (words[left + i].compareTo(words[right - i]) < 0) {
                    leftSmaller = true;
                    break;
                } else if (words[left + i].compareTo(words[right - i]) > 0) {
                    leftSmaller = false;
                    break;
                }
            }
            
            if (leftSmaller) {
                sb.append(words[left]);
                left++;
            } else {
                sb.append(words[right]);
                right--;
            }
        }
        
        String result = sb.toString();
        for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i));
            if ((i + 1) % 80 == 0) {
                System.out.println();
            }
        }
    }
}