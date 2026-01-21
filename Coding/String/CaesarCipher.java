package String;

// import java.util.Scanner;

public class CaesarCipher {

    // Method to encrypt the text
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) 
        {
            char c = text.charAt(i);

            if (Character.isUpperCase(c)) 
            {
                // Shift uppercase letters
                char ch = (char)(((c - 'A' + shift) % 26) + 'A');
                result.append(ch);
            } 
            else if (Character.isLowerCase(c)) 
            {
                // Shift lowercase letters
                char ch = (char)(((c - 'a' + shift) % 26) + 'a');
                result.append(ch);
            } 
            else 
            {
                // Keep non-alphabetic characters unchanged
                result.append(c);
            }
        }

        return result.toString();
    }
    public static String decrypt(String text, int shift) 
    {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) 
        {
            char c = text.charAt(i);

            if (Character.isUpperCase(c)) 
            {
                // Shift uppercase letters backward
                char ch = (char)(((c - 'A' - shift + 26) % 26) + 'A');
                result.append(ch);
            } 
            else if (Character.isLowerCase(c)) 
            {
                // Shift lowercase letters backward
                char ch = (char)(((c - 'a' - shift + 26) % 26) + 'a');
                result.append(ch);
            } 
            else 
            {
                // Keep non-alphabetic characters unchanged
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) 
    {
        //Scanner sc = new Scanner(System.in);

        //System.out.print("Enter text to encrypt: ");
        String text = "JAYABALAJEE S K"; //sc.nextLine();

        //System.out.print("Enter shift value: ");
        int shift = 3; //sc.nextInt();

        String encryptedText = encrypt(text, shift);
        System.out.println("Encrypted text: " + encryptedText);

        String decrypted = decrypt(encryptedText, shift);     
        System.out.println("decrypted text: " + decrypted);
    }
}
// Encrypted text: MDBDEDODMHH V N
// decrypted text: JAYABALAJEE S K