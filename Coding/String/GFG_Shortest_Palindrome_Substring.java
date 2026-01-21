package String;

public class GFG_Shortest_Palindrome_Substring
{
    static String shortestPalindrome(String s)
    {
        char minChar = s.charAt(0);

        for (int i = 1; i < s.length(); i++)
        {
            if (s.charAt(i) < minChar)
            {
                minChar = s.charAt(i);
            }
        }

        return String.valueOf(minChar);
    }

    public static void main(String[] args)
    {
        System.out.println(shortestPalindrome("zyzz")); // y
        System.out.println(shortestPalindrome("abab")); // a
    }
}

