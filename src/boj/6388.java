import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            String num = String.valueOf(i);
            if (num.contains("3") || num.contains("6") || num.contains("9")) {
                System.out.println("Korea");
            } else {
                System.out.println(i);
            }
        }
    }
}