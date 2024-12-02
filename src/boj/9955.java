import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int count = 0;
            int result = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ' ') {
                    result = Math.max(result, count);
                    count = 0;
                } else {
                    count++;
                }
            }

            result = Math.max(result, count);
            System.out.println(result);
        }
    }
}