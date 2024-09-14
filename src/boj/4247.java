import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String str1 = sc.next();
            String str2 = sc.next();
            
            if (str1.equals("#") && str2.equals("#")) {
                break;
            }
            
            int count = 0;
            int index = 0;
            
            while (index < str1.length()) {
                index = str1.indexOf(str2, index);
                
                if (index == -1) {
                    break;
                }
                
                count++;
                index += str2.length();
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}