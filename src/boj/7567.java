import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plates = sc.next();

        int height = 10;
        for (int i = 1; i < plates.length(); i++) {
            if (plates.charAt(i) == plates.charAt(i - 1)) {
                height += 5;
            } else {
                height += 10;
            }
        }

        System.out.println(height);
    }
}