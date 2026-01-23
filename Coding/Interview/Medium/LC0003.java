package Interview.Medium;

import java.util.HashSet;
import java.util.Set;

public class LC0003 
{
    public int lengthOfLongestSubstring(String str)
    {
        Set<Character> set = new HashSet<>();
        int left = 0, max = 0;

        for (int right = 0; right < str.length(); right++)
        {
            while (set.contains(str.charAt(right)))
            {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    // 🔹 MAIN METHOD
    public static void main(String[] args)
    {
        LC0003 obj = new LC0003();

        String str = "abba";

        int result = obj.lengthOfLongestSubstring(str);

        System.out.println("Input String : " + str);
        System.out.println("Longest Substring Length : " + result);
    }
}
// Input String : abba
// Longest Substring Length : 2