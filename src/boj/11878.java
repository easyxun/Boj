import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next(), 2);
        char op = sc.next().charAt(0);
        int b = Integer.parseInt(sc.next(), 2);
        
        int result;
        if (op == '+') {
            result = a + b;
        } else {
            result = a ^ b;
        }
        
        System.out.println(Integer.toBinaryString(result));
        
        sc.close();
    }
}