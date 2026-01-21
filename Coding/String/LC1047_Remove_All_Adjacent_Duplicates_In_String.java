package String;

public class LC1047_Remove_All_Adjacent_Duplicates_In_String {

    public static String removeDuplicates(String s) 
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) 
        {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == s.charAt(i)) 
            {
                sb.deleteCharAt(sb.length() - 1);
            } 
            else 
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    // MAIN METHOD
    public static void main(String[] args) 
    {

        // Test case 1
        String s1 = "abbaca";
        System.out.println(removeDuplicates(s1)); // ca

        // Test case 2
        String s2 = "azxxzy";
        System.out.println(removeDuplicates(s2)); // ay
    }
}
// ca
// ay