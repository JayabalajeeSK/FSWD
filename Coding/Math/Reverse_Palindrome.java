package Math;

import java.util.Scanner;

public class Reverse_Palindrome 
{

    // ================= NUMBER METHODS =================

    // Reverse number (WITHOUT handling minus)
    static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) 
        {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        return rev;
    }

    // Reverse number (WITH handling minus)
    static int reverseNumberWithSign(int n) 
    {
        int sign = n < 0 ? -1 : 1;
        n = Math.abs(n);

        int rev = 0;
        while (n > 0) 
        {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        return rev * sign;
    }

    // Palindrome number (WITHOUT minus)
    static boolean isPalindromeNumber(int n) 
    {
        return n == reverseNumber(n);
    }

    // Palindrome number (WITH minus handling)
    static boolean isPalindromeNumberWithSign(int n) 
    {
        return n == reverseNumberWithSign(n);
    }

    // ================= STRING METHODS =================

    // Reverse string
    static String reverseString(String s) 
    {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) 
        {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    // Palindrome string
    static boolean isPalindromeString(String s) 
    {
        return s.equals(reverseString(s));
    }

    // ================= MAIN (NORMAL LOGIC DEMO) =================

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // ---------- NUMBER ----------
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Normal logic (inside main)
        int temp = Math.abs(num);
        int rev = 0;
        while (temp > 0) 
        {
            rev = rev * 10 + temp % 10;
            temp =temp + 10;
        }
        rev = num < 0 ? -rev : rev;

        System.out.println("\n--- NORMAL LOGIC ---");
        System.out.println("Reversed Number = " + rev);
        System.out.println("Palindrome? " + (num == rev));

        // Using methods
        System.out.println("\n--- USING METHODS ---");
        System.out.println("Reverse (no minus logic) = " + reverseNumber(Math.abs(num)));
        System.out.println("Reverse (with minus logic) = " + reverseNumberWithSign(num));
        System.out.println("Palindrome (no minus) = " + isPalindromeNumber(Math.abs(num)));
        System.out.println("Palindrome (with minus) = " + isPalindromeNumberWithSign(num));

        // ---------- STRING ----------
        sc.nextLine(); // clear buffer
        System.out.print("\nEnter a string: ");
        String str = sc.nextLine();

        // Normal logic
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            revStr = revStr + str.charAt(i);
        }

        System.out.println("\n--- NORMAL LOGIC ---");
        System.out.println("Reversed String = " + revStr);
        System.out.println("Palindrome? " + str.equals(revStr));

        // Using methods
        System.out.println("\n--- USING METHODS ---");
        System.out.println("Reversed String = " + reverseString(str));
        System.out.println("Palindrome String = " + isPalindromeString(str));

        sc.close();
    }
}
// Enter a number: 124

// --- NORMAL LOGIC ---
// Reversed Number = 477218588
// Palindrome? false

// --- USING METHODS ---
// Reverse (no minus logic) = 421
// Reverse (with minus logic) = 421
// Palindrome (no minus) = false
// Palindrome (with minus) = false

// Enter a string: alla

// --- NORMAL LOGIC ---
// Reversed String = alla
// Palindrome? true

// --- USING METHODS ---
// Reversed String = alla
// Palindrome String = true

// Enter a number: -145

// --- NORMAL LOGIC ---
// Reversed Number = 477218589
// Palindrome? false

// --- USING METHODS ---
// Reverse (no minus logic) = 541
// Reverse (with minus logic) = -541
// Palindrome (no minus) = false
// Palindrome (with minus) = false

// Enter a string: -jaya

// --- NORMAL LOGIC ---
// Reversed String = ayaj-
// Palindrome? false

// --- USING METHODS ---
// Reversed String = ayaj-
// Palindrome String = false