package String;

import java.util.Arrays;

public class LC0242_Valid_Anagram 
{

    public boolean isAnagram(String s, String t) 
    {
        if (s.length() != t.length()) return false;
        // HashMap<Character,Integer>map=new HashMap<>();

        // for(char c:s.toCharArray()){
        //     map.put(c,map.getOrDefault(c,0)+1);
        // }
        // for(char c:t.toCharArray()){
        //     if(!map.containsKey(c)) return false;
        //     map.put(c,map.get(c)-1);
        //     if(map.get(c)<0) return false;
        // }
        // return true;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }

    // MAIN METHOD
    public static void main(String[] args) 
    {
        LC0242_Valid_Anagram sol = new LC0242_Valid_Anagram();

        // Test case 1
        String s1 = "anagram";
        String t1 = "nagaram";
        System.out.println(sol.isAnagram(s1, t1)); // true

        // Test case 2
        String s2 = "rat";
        String t2 = "car";
        System.out.println(sol.isAnagram(s2, t2)); // false
    }
}

