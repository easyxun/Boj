import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int sum = 0;
            for (String num : input) {
                sum += Integer.parseInt(num);
            }
            System.out.println(sum);
        }

        sc.close();
    }
}