package Basics_Java.Problems.Basic;

public class B7_Palindrome {

    // -------------------- Number Palindrome --------------------
    public static boolean isNumberPalindrome(int n) 
    {
        int original = n;
        int rev = 0;

        while (n > 0) 
        {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        return original == rev;
    }

    // -------------------- String Palindrome --------------------
    public static boolean isStringPalindrome(String s)
    {
        int left = 0, right = s.length() - 1;

        while (left < right) 
        {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // -------------------- Array Palindrome ---------------------
    public static boolean isArrayPalindrome(int[] arr) 
    {
        int left = 0, right = arr.length - 1;

        while (left < right) 
        {
            if (arr[left] != arr[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    // -------------------- Main -------------------------------
    public static void main(String[] args) 
    {


        int num = 12321;
        String str = "madam";
        int[] arr = {1, 2, 3, 2, 1};

        System.out.println("Number " + num + " is palindrome? " + isNumberPalindrome(num));


        System.out.println("String \"" + str + "\" is palindrome? " + isStringPalindrome(str));

  
        System.out.print("Array {");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]);

            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("} is palindrome? " + isArrayPalindrome(arr));
    }
}

// Number 12321 is palindrome? true
// String "madam" is palindrome? true
// Array {1, 2, 3, 2, 1} is palindrome? true