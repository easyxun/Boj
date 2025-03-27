import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int caseNum = 1;
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int max = Math.max(a, Math.max(b, c));
            int min = Math.min(a, Math.min(b, c));
            int mid = a + b + c - max - min;

            if (max >= min + mid) {
                System.out.println("Case " + caseNum + ": Invalid");
            } else if (a == b && b == c) {
                System.out.println("Case " + caseNum + ": Equilateral");
            } else if (a == b || b == c || a == c) {
                System.out.println("Case " + caseNum + ": Isosceles");
            } else {
                System.out.println("Case " + caseNum + ": Scalene");
            }

            caseNum++;
        }

        sc.close();
    }
}