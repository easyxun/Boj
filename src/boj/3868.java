import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.nextLine();
            String[] parts = input.split(" ");

            if (parts[1].equals("+")) {
                int result = Integer.parseInt(parts[0]) + Integer.parseInt(parts[2]);
                System.out.println(result);
            } else if (parts[1].equals("-")) {
                int result = Integer.parseInt(parts[0]) - Integer.parseInt(parts[2]);
                System.out.println(result);
            } else if (parts[1].equals("*")) {
                int result = Integer.parseInt(parts[0]) * Integer.parseInt(parts[2]);
                System.out.println(result);
            } else if (parts[1].equals("/")) {
                int result = Integer.parseInt(parts[0]) / Integer.parseInt(parts[2]);
                System.out.println(result);
            } else if (parts[1].equals("%")) {
                int result = Integer.parseInt(parts[0]) % Integer.parseInt(parts[2]);
                System.out.println(result);
            }
        }
    }
}