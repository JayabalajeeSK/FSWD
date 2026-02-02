package Basics_Java.Problems.Basic;

import java.util.*;
import java.util.stream.*;

public class B2_Reverse {

    // ------------------------------
    // 1. Reverse Digits (Manual)
    // ------------------------------
    public static int reverseDigits(int num) 
    {
        int rev = 0;
        while (num > 0) 
        {
            int digits = num % 10;
            rev = rev * 10 + digits;
            num = num / 10;
        }
        return rev;
    }

    // 1B. Reverse Digits Built-In (StringBuilder)
    public static int reverseDigitsBuiltIn(int num) 
    {
        return Integer.parseInt(new StringBuilder(num + "").reverse().toString());
    }

    // 1C. Reverse Digits Using Streams
    public static int reverseDigitsStream(int num) 
    {
        String reversed = Arrays.stream((num + "").split(""))
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.joining());
        return Integer.parseInt(reversed);
    }


    // ------------------------------
    // 2. Reverse String (Manual)
    // ------------------------------
    public static String reverseString(String s) 
    {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) 
        {
            rev = rev + s.charAt(i);
        }
        return rev;
    }


    public static String reverseFullString(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

///////////////////////
/// 
    public static String reverseEachWord(String str)
    {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words)
        {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }

//////////////////////
/// 
    public static String reverseWordOrder(String str)
    {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
        {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }

    // 2B. Reverse String Built-In
    public static String reverseStringBuiltIn(String s) 
    {
        return new StringBuilder(s).reverse().toString();
    }

    // 2C. Reverse String Using Streams
    public static String reverseStringStream(String s) 
    {
        return Stream.of(s.split(""))
                     .sorted(Comparator.reverseOrder())
                     .collect(Collectors.joining());
    }


    // ------------------------------
    // 3. Reverse Array (Two-pointer)
    // ------------------------------
    public static void reverseArray(int[] arr) 
    {
        int left = 0, right = arr.length - 1;
        while (left < right) 
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // 3B. Reverse Array Using XOR Swap
    public static void reverseArrayXOR(int[] arr) 
    {
        int left = 0, right = arr.length - 1;
        while (left < right) 
        {
            arr[left] = arr[left] ^ arr[right];
            arr[right] = arr[right] ^ arr[left];
            arr[left] = arr[left] ^ arr[right];
            left++;
            right--;
        }
    }

    // 3C. Reverse Array Built-In (Collections.reverse)
    public static void reverseArrayBuiltIn(Integer[] arr) 
    {
        Collections.reverse(Arrays.asList(arr));
    }

    // 3D. Reverse Array Using Streams
    public static int[] reverseArrayStream(int[] arr) 
    {
        return IntStream.range(0, arr.length)
                        .map(i -> arr[arr.length - 1 - i])
                        .toArray();
    }


    // ------------------------------
    // MAIN
    // ------------------------------
    public static void main(String[] args) 
    {

        // DIGITS
        System.out.println(reverseDigits(12345));            // 54321
        System.out.println(reverseDigitsBuiltIn(12345));     // 54321
        System.out.println(reverseDigitsStream(12345));      // Reversed using stream

        // STRING
        System.out.println(reverseString("hello"));          // olleh
        System.out.println(reverseStringBuiltIn("hello"));   // olleh
        System.out.println(reverseStringStream("hello"));    // "olleh" (using stream)
        System.out.println(reverseFullString("Hello world A")); //A dlrow olleH
        System.out.println(reverseEachWord("Hello World A")); //olleH dlroW A
        System.out.println(reverseWordOrder("Hello World A")); //A World Hello

        // ARRAY (two-pointer)
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));            // [5, 4, 3, 2, 1]

        // ARRAY (XOR)
        int[] arrXor = {1, 2, 3, 4, 5};
        reverseArrayXOR(arrXor);
        System.out.println(Arrays.toString(arrXor));         // [5, 4, 3, 2, 1]

        // ARRAY (built-in)
        Integer[] arrBuilt = {1, 2, 3, 4, 5};
        reverseArrayBuiltIn(arrBuilt);
        System.out.println(Arrays.toString(arrBuilt));       // [5, 4, 3, 2, 1]

        // ARRAY (streams)
        int[] arrStream = reverseArrayStream(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(arrStream));      // [5,4,3,2,1]
    }
}

// 54321
// 54321
// 54321
// olleh
// olleh
// ollhe
// A dlrow olleH
// olleH dlroW A
// A World Hello
// [5, 4, 3, 2, 1]
// [5, 4, 3, 2, 1]
// [5, 4, 3, 2, 1]
// [5, 4, 3, 2, 1]