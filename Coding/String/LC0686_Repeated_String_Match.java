package String;


public class LC0686_Repeated_String_Match {

    public static int repeatedStringMatch(String a, String b) 
    {
        int n = b.length() / a.length(); // max repeats needed
        StringBuilder sb = new StringBuilder();
        int ans = 0;

        for (int i = 0; i <= n + 2; i++) 
        {
            if (sb.toString().contains(b)) 
            {
                return ans;
            }
            sb.append(a);
            ans++;
        }
        return -1;
    }

    // MAIN METHOD
    public static void main(String[] args) 
    {

        // Test case 1
        String a1 = "abcd";
        String b1 = "cdabcdab";
        System.out.println(repeatedStringMatch(a1, b1)); // Output: 3

        // Test case 2
        String a2 = "a";
        String b2 = "aa";
        System.out.println(repeatedStringMatch(a2, b2)); // Output: 2
    }
}
