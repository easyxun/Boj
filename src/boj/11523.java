import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNext()) {
            sum += sc.nextInt();
        }

        System.out.println(sum);
    }
}