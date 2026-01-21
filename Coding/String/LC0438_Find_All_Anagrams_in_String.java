package String;

import java.util.*;

public class LC0438_Find_All_Anagrams_in_String {

    public static List<Integer> findAnagrams(String s, String p) 
    {
        List<Integer> res = new ArrayList<>();
        int[] a = new int[26];

        // Frequency of characters in p
        for (int i = 0; i < p.length(); i++) 
        {
            a[p.charAt(i) - 'a']++;
        }

        // Sliding window
        for (int i = 0, st = 0; i < s.length(); i++) 
        {
            a[s.charAt(i) - 'a']--;

            while (a[s.charAt(i) - 'a'] < 0 && st <= i) 
            {
                a[s.charAt(st++) - 'a']++;
            }

            if (i - st + 1 == p.length()) 
            {
                res.add(st);
            }
        }
        return res;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Test case 1
        String s1 = "cbaebabacd";
        String p1 = "abc";
        System.out.println(findAnagrams(s1, p1)); // [0, 6]

        // Test case 2
        String s2 = "abab";
        String p2 = "ab";
        System.out.println(findAnagrams(s2, p2)); // [0, 1, 2]
    }
}
