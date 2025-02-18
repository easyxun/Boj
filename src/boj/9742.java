import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String num = sc.next();
            int k = sc.nextInt();
            
            if (num.length() < k) {
                System.out.println(num + " -1");
            } else {
                char[] arr = num.toCharArray();
                char temp = arr[k-1];
                arr[k-1] = arr[num.length()-k];
                arr[num.length()-k] = temp;
                
                System.out.print(num + " ");
                for (char c : arr) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}