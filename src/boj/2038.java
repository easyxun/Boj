import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;

        while (sum < n) {
            count++;
            sum += count;
        }

        System.out.println(count);
    }
}