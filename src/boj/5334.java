import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if(input.equals("Cat")) {
            System.out.println("Myau");
        } else {
            System.out.println("Gav");
        }
    }
}