package Basics_Java.Problems.Basic;

import java.util.Arrays;

public class B9_TypeConversionDemo {
    public static void main(String[] args) {

        // 1️⃣ String "A" → char 'A' and char 'A' → String "A"
        String strChar = "A";
        char c = strChar.charAt(0);   // String → char
        String strFromChar = Character.toString(c); // char → String
        System.out.println("String to char: " + c);
        System.out.println("Char to String: " + strFromChar);

        System.out.println("------------------------------------------------");

        // 2️⃣ String "12345" → int 12345 and int 12345 → String "12345"
        String strNum = "12345";
        int num = Integer.parseInt(strNum);      // String → int
        String strFromNum = Integer.toString(num); // int → String
        System.out.println("String to int: " + num);
        System.out.println("Int to String: " + strFromNum);

        System.out.println("------------------------------------------------");

        // 3️⃣ String ↔ Array
        String str = "HelloWorld";
        // String → char array
        char[] charArray = str.toCharArray();
        System.out.println("String to char array: " + Arrays.toString(charArray));
        // Char array → String
        String strFromArray = new String(charArray);
        System.out.println("Char array to String: " + strFromArray);

        System.out.println("------------------------------------------------");

        // 4️⃣ Binary ↔ Decimal
        String binaryStr = "1010"; // binary string
        int decimal = Integer.parseInt(binaryStr, 2); // binary → decimal
        System.out.println("Binary " + binaryStr + " to Decimal: " + decimal);

        int decNum = 25;
        String binaryFromDec = Integer.toBinaryString(decNum); // decimal → binary
        System.out.println("Decimal " + decNum + " to Binary: " + binaryFromDec);
    }
}
// String to char: A
// Char to String: A
// ------------------------------------------------
// String to int: 12345
// Int to String: 12345
// ------------------------------------------------
// String to char array: [H, e, l, l, o, W, o, r, l, d]
// Char array to String: HelloWorld
// ------------------------------------------------
// Binary 1010 to Decimal: 10
// Decimal 25 to Binary: 11001