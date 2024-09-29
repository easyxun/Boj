import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        if (N >= M && M >= K) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
        
        sc.close();
    }
}