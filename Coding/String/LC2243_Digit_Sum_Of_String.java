package String;

public class LC2243_Digit_Sum_Of_String 
{

    public static String digitSum(String s, int k) 
    {
        if (s.length() <= k) return s;

        StringBuilder r = new StringBuilder();

        for (int i = 1, sum = 0; i <= s.length(); i++) 
        {
            sum = sum + s.charAt(i - 1) - '0';

            if (i % k == 0 || i == s.length()) 
            {
                r.append(sum);
                sum = 0;
            }
        }
        return digitSum(r.toString(), k);
    }

    // MAIN METHOD
    public static void main(String[] args) 
    {

        // Test Case 1
        String s1 = "11111222223";
        int k1 = 3;
        System.out.println("Output: " + digitSum(s1, k1)); // Expected: 135

        // Test Case 2
        String s2 = "00000000";
        int k2 = 3;
        System.out.println("Output: " + digitSum(s2, k2)); // Expected: 000
    }
}
// Output: 135
// Output: 000