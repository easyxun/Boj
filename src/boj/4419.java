import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= 'a' && arr[j] <= 'z') {
                    arr[j] = (char)('z' - (arr[j] - 'a'));
                } else if (arr[j] >= 'A' && arr[j] <= 'Z') {
                    arr[j] = (char)('Z' - (arr[j] - 'A'));
                }
            }
            
            System.out.println(new String(arr));
        }
        
        sc.close();
    }
}