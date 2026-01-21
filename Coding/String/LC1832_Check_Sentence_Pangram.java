package String;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public static boolean checkIfPangram(String sentence) 
    {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) 
        {
            set.add(sentence.charAt(i));
        }
        return set.size() == 26;
    // Set<Character> set = new HashSet<>();
    // for(int i = 0; i < s.length(); set.add(s.charAt(i++))){}
    // return set.size() == 26;
    }

    // MAIN METHOD
    public static void main(String[] args) {
        // Test case 1
        String s1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s1)); // true

        // Test case 2
        String s2 = "leetcode";
        System.out.println(checkIfPangram(s2)); // false
    }
}
