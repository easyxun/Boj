import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        String reversedNum = new StringBuilder(num).reverse().toString();
        int result = Integer.parseInt(num) + Integer.parseInt(reversedNum);

        System.out.println(result);
    }
}