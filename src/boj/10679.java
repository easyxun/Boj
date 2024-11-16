import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            if (str.equals("Simon says")) {
                System.out.println(str.substring(11));
            }
        }

        sc.close();
    }
}