import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int count = 0;
        
        while(A != B) {
            if(A > B) {
                A = A - B;
            } else {
                B = B - A;
            }
            count++;
        }
        
        System.out.println(count);
    }
}