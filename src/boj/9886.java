import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.equals(str2)) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        sc.close();
    }
}