import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            String str1 = sc.next();
            String str2 = sc.next();
            
            if(str1.equals("#") && str2.equals("#")) {
                break;
            }
            
            int diff = str2.charAt(0) - str1.charAt(0);
            
            if(diff < 0) {
                diff += 26;
            }
            
            System.out.println(diff);
        }
        
        sc.close();
    }
}