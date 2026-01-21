package Array;
public class LC1662_Check_If_Two_String_Arrays_are_Equivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String words1 = "";
        for (int i = 0; i < word1.length; i++) 
        {
            words1 = words1 + word1[i];
        }

        String words2 = "";
        for (int i = 0; i < word2.length; i++) 
        {
            words2 = words2 + word2[i];
        }

        return words1.equals(words2);
    }

    // Main method for testing
    public static void main(String[] args) {
    

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1, word2)); // true

        String[] word3 = {"a", "cb"};
        String[] word4 = {"ab", "c"};

        System.out.println(arrayStringsAreEqual(word3, word4)); // false

        String[] word5 = {"abc", "d", "defg"};
        String[] word6 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word5, word6)); // true
    }
}
// true
// false
// true

// class Solution 
// {
//     public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
//     {
//         StringBuilder str1 = new StringBuilder();
//         StringBuilder str2 = new StringBuilder();

//         for(String word : word1) str1.append(word);
//         for(String word : word2) str2.append(word);

//         String s1 = str1.toString();
//         String s2 = str2.toString();

//         if(s1.equals(s2)) return true;
//         else return false;
//     }
// }