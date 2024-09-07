import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()) {
            String input = sc.nextLine();
            String output = decrypt(input);
            System.out.println(output);
        }
        
        sc.close();
    }
    
    public static String decrypt(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String decrypted = "";
        
        for(int i=0; i<input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            int index = alphabet.indexOf(c);
            
            if(index != -1) {
                int newIndex = (index + 15) % 26;
                char newChar = alphabet.charAt(newIndex);
                
                if(Character.isUpperCase(input.charAt(i))) {
                    decrypted += Character.toUpperCase(newChar);
                } else {
                    decrypted += newChar;
                }
            } else {
                decrypted += input.charAt(i);
            }
        }
        
        return decrypted;
    }
}