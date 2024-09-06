import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                System.out.print(input.charAt(j));
            }
        }
    }
}