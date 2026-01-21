package String;

public class LC1392_Logest_Happy_Prefix {

    public static String longestPrefix(String s) 
    {
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > 0) 
        {
            sb.deleteCharAt(sb.length() - 1);

            if (s.endsWith(sb.toString())) 
            {
                return sb.toString();
            }
        }
        return "";
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Test case 1
        String s1 = "level";
        System.out.println(longestPrefix(s1)); // Output: l

        // Test case 2
        String s2 = "ababab";
        System.out.println(longestPrefix(s2)); // Output: abab

        // Test case 3
        String s3 = "abc";
        System.out.println(longestPrefix(s3)); // Output: ""
    }
}
// l
// abab
//