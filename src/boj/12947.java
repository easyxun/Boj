import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % sumOfDigits(n) == 0 && n % sumOfDigits(n) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}