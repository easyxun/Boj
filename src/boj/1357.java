import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String X = sc.next();
        String Y = sc.next();
        
        int reversedX = Integer.parseInt(new StringBuilder(X).reverse().toString());
        int reversedY = Integer.parseInt(new StringBuilder(Y).reverse().toString());
        
        int result = reversedX + reversedY;
        String resultStr = new StringBuilder(String.valueOf(result)).reverse().toString();
        
        System.out.println(Integer.parseInt(resultStr));
        
        sc.close();
    }
}