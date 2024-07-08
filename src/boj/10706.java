import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int num = 1;

        while (count < n) {
            String str = String.valueOf(num);
            sum += str.length();
            if (sum >= n) {
                int diff = sum - n;
                System.out.println(str.charAt(str.length() - 1 - diff));
                break;
            }
            count++;
            num++;
        }
    }
}