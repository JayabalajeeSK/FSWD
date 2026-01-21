package Array;

import java.util.Arrays;

public class LC0344_TwoPointer_Reverse_String 
{
    public static void reverseString(char[] s) 
    {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) 
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    // Main method for testing
    public static void main(String[] args) 
    {

        char[] s1 = {'h','e','l','l','o'};
        reverseString(s1);
        System.out.println(Arrays.toString(s1)); // [o, l, l, e, h]

        char[] s2 = {'H','a','n','n','a','h'};
        reverseString(s2);
        System.out.println(Arrays.toString(s2)); // [h, a, n, n, a, H]
    }
}
// [o, l, l, e, h]
// [h, a, n, n, a, H]