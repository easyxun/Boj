import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int W = sc.nextInt();
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        if (A >= W && B >= L) {
            System.out.println("SHE FITS");
        } else {
            System.out.println("SHE DOESN'T FIT");
        }
    }
}