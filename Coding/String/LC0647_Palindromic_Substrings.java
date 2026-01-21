package String;

public class LC0647_Palindromic_Substrings 
{

    static int result = 0;

    public static int countSubstrings(String s) 
    {
        for (int i = 0; i < s.length(); i++) 
        {
            count(s, i, i);     // odd length palindromes (aba)
            count(s, i, i + 1); // even length palindromes (abba)
        }
        return result;
    }

    private static void count(String s, int strt, int end) 
    {
        while (strt >= 0 && end < s.length() && s.charAt(strt) == s.charAt(end)) 
        {
            result++;
            strt--;
            end++;
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Test case 1
        String s1 = "abc";
        System.out.println(countSubstrings(s1)); // 3

        // Reset result for next test
        result = 0;

        // Test case 2
        String s2 = "aaa";
        System.out.println(countSubstrings(s2)); // 6
    }
}
