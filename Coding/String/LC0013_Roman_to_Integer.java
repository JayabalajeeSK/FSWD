package String;

import java.util.HashMap;
import java.util.Map;

public class LC0013_Roman_to_Integer {

    public static int romanToInt(String s) {
        int num = 0;

        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) 
        {
            if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) 
            {
                num = num - roman.get(s.charAt(i));
            } 
            else 
            {
                num = num + roman.get(s.charAt(i));
            }
        }
        return num + roman.get(s.charAt(s.length() - 1));
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Test case 1
        String s1 = "III";
        System.out.println(romanToInt(s1)); // 3

        // Test case 2
        String s2 = "LVIII";
        System.out.println(romanToInt(s2)); // 58

        // Test case 3
        String s3 = "MCMXCIV";
        System.out.println(romanToInt(s3)); // 1994
    }
}

