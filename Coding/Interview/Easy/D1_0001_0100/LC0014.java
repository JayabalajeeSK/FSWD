package Interview.Easy.D1_0001_0100;
import java.util.Arrays;

public class LC0014 
{
    // Method to find longest common prefix
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs == null || strs.length == 0) return "";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while(i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i))
        {
            i++;
        }
        return first.substring(0, i);
    }

    // Main method for testing
    public static void main(String[] args) 
    {
        LC0014 sol = new LC0014();

        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("LCP of " + Arrays.toString(strs1) + " = " + sol.longestCommonPrefix(strs1));

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("LCP of " + Arrays.toString(strs2) + " = " + sol.longestCommonPrefix(strs2));

        String[] strs3 = {"flowe", "flow", "flo"};
        System.out.println("LCP of " + Arrays.toString(strs3) + " = " + sol.longestCommonPrefix(strs3));

        String[] strs4 = {"flight", "funk", "flower"};
        System.out.println("LCP of " + Arrays.toString(strs4) + " = " + sol.longestCommonPrefix(strs4));
    }
}

