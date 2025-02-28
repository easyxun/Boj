import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNum = 1;

        while (true) {
            String str1 = sc.next();
            String str2 = sc.next();

            if (str1.equals("END") && str2.equals("END")) {
                break;
            }

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Case " + caseNum + ": same");
            } else {
                System.out.println("Case " + caseNum + ": different");
            }

            caseNum++;
        }
    }
}