import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            StringBuilder sb = new StringBuilder();

            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    char newChar = (char) (c + 13);
                    if ((Character.isLowerCase(c) && newChar > 'z') || (Character.isUpperCase(c) && newChar > 'Z')) {
                        newChar -= 26;
                    }
                    sb.append(newChar);
                } else {
                    sb.append(c);
                }
            }

            System.out.println(sb.toString());
        }
    }
}