package String;

public class LC0214_Shortest_Palindrome {

    public static String shortestPalindrome(String s) 
    {
        String t = new StringBuilder(s).reverse().toString();

        for (int i = 0; i < t.length(); i++) 
        {
            if (s.startsWith(t.substring(i))) 
            {
                return t.substring(0, i) + s;
            }
        }
        return "";
    }

    // MAIN METHOD
    public static void main(String[] args) 
    {

        // Test case 1
        String s1 = "aacecaaa";
        System.out.println(shortestPalindrome(s1)); // aaacecaaa

        // Test case 2
        String s2 = "abcd";
        System.out.println(shortestPalindrome(s2)); // dcbabcd

        // Test case 3 (edge case)
        String s3 = "";
        System.out.println(shortestPalindrome(s3)); // ""
    }
}
// aaacecaaa
// dcbabcd
//