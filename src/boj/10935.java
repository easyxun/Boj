import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String encoded = Base64.getEncoder().encodeToString(input.getBytes());
        System.out.println(encoded);
    }
}