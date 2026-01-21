package Array;

import java.util.HashSet;
import java.util.Set;

public class LC0003_Longest_Substring_Without_Repeating_Characters 
{
    public static int lengthOfLongestSubstring(String str) 
    {
        Set<Character> set = new HashSet<>();
        int max = 0, left = 0;

        for (int right = 0; right < str.length(); right++) 
        {
            char currentChar = str.charAt(right);

            // Remove characters from the left until currentChar is not in the set
            while (set.contains(currentChar)) 
            {
                set.remove(str.charAt(left));
                left++;
            }

            // Add current character to the set
            set.add(currentChar);

            // Update the max length
            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) 
    {

        // Example 1
        String s1 = "abcabcbb";
        System.out.println("Example 1 Output: " + lengthOfLongestSubstring(s1)); // Expected: 3

        // Example 2
        String s2 = "bbbbb";
        System.out.println("Example 2 Output: " + lengthOfLongestSubstring(s2)); // Expected: 1

        // Example 3
        String s3 = "pwwkew";
        System.out.println("Example 3 Output: " + lengthOfLongestSubstring(s3)); // Expected: 3

        // Example 4 (optional)
        String s4 = "";
        System.out.println("Example 4 Output: " + lengthOfLongestSubstring(s4)); // Expected: 0
    }
}
// Example 1 Output: 3
// Example 2 Output: 1
// Example 3 Output: 3
// Example 4 Output: 0