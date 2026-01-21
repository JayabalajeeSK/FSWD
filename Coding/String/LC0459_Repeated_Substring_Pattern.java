package String;

public class LC0459_Repeated_Substring_Pattern 
{

    public static boolean repeatedSubstringPattern(String s) 
    {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Test case 1
        String s1 = "abab";
        System.out.println(repeatedSubstringPattern(s1)); // true

        // Test case 2
        String s2 = "aba";
        System.out.println(repeatedSubstringPattern(s2)); // false

        // Test case 3
        String s3 = "abcabcabcabc";
        System.out.println(repeatedSubstringPattern(s3)); // true
    }
}
