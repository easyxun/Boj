import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String target = sc.nextLine();

        int count = 0;
        for (int i = 0; i < target.length(); i++) {
            if (pattern.equals(String.valueOf(target.charAt(i)))) {
                count++;
            }
        }

        System.out.println(count);
    }
}