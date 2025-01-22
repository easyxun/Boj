import java.util.Base64;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        byte[] decodedBytes = Base64.getDecoder().decode(input);
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);
    }
}