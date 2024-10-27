import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int strike = sc.nextInt();
            int ball = sc.nextInt();

            String number = String.valueOf(num);

            boolean isPossible = true;

            if (number.charAt(0) == number.charAt(1) || number.charAt(1) == number.charAt(2) || number.charAt(0) == number.charAt(2) ||
                    number.charAt(0) == '0' || number.charAt(1) == '0' || number.charAt(2) == '0') {
                isPossible = false;
            }

            if (isPossible) {
                for (int j = 123; j <= 987; j++) {
                    String target = String.valueOf(j);
                    if (target.charAt(0) == target.charAt(1) || target.charAt(1) == target.charAt(2) || target.charAt(0) == target.charAt(2) ||
                            target.charAt(0) == '0' || target.charAt(1) == '0' || target.charAt(2) == '0') {
                        continue;
                    }

                    int s = 0, b = 0;
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (k == l && number.charAt(k) == target.charAt(l)) {
                                s++;
                            }
                            if (k != l && number.charAt(k) == target.charAt(l)) {
                                b++;
                            }
                        }
                    }

                    if (s != strike || b != ball) {
                        isPossible = false;
                        break;
                    }
                }
            }

            if (isPossible) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}