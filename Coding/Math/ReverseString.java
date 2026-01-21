package Math;

public class ReverseString 
{

    // ================= NORMAL METHODS =================

    // 1. Reverse full string (character by character)
    static String reverseStringNormal(String s) 
    {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) 
        {
            rev = rev + s.charAt(i);
        }
        return rev;
    }

    // 2. Reverse word order
    static String reverseWordsOrderNormal(String s) 
    {
        String[] words = s.split(" ");
        String rev = "";

        for (int i = words.length - 1; i >= 0; i--) 
        {
            rev = rev + words[i] + " ";
        }
        return rev.trim();
    }

    // 3. Reverse each word
    static String reverseEachWordNormal(String s) 
    {
        String[] words = s.split(" ");
        String result = "";

        for (String word : words) 
        {
            result = result + reverseStringNormal(word) + " ";
        }
        return result.trim();
    }

    // ================= INBUILT METHODS =================

    // 1. Reverse full string (StringBuilder)
    static String reverseStringInbuilt(String s) 
    {
        return new StringBuilder(s).reverse().toString();
    }

    // 2. Reverse word order (Collections logic)
    static String reverseWordsOrderInbuilt(String s) 
    {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) 
        {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }

    // 3. Reverse each word (StringBuilder)
    static String reverseEachWordInbuilt(String s) 
    {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) 
        {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    // ================= MAIN =================
    public static void main(String[] args) 
    {

        String input = "Java World";

        System.out.println("Input: " + input);

        System.out.println("\n--- NORMAL METHODS ---");
        System.out.println("1. Full Reverse      : " + reverseStringNormal(input));
        System.out.println("2. Word Order Reverse: " + reverseWordsOrderNormal(input));
        System.out.println("3. Each Word Reverse : " + reverseEachWordNormal(input));

        System.out.println("\n--- INBUILT METHODS ---");
        System.out.println("1. Full Reverse      : " + reverseStringInbuilt(input));
        System.out.println("2. Word Order Reverse: " + reverseWordsOrderInbuilt(input));
        System.out.println("3. Each Word Reverse : " + reverseEachWordInbuilt(input));
    }
}
// Input: Java World

// --- NORMAL METHODS ---
// 1. Full Reverse      : dlroW avaJ
// 2. Word Order Reverse: World Java
// 3. Each Word Reverse : avaJ dlroW

// --- INBUILT METHODS ---
// 1. Full Reverse      : dlroW avaJ
// 2. Word Order Reverse: World Java
// 3. Each Word Reverse : avaJ dlroW