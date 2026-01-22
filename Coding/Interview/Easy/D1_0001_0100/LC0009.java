package Interview.Easy.D1_0001_0100;

public class LC0009 
{
    public boolean isPalindrome(int x) 
    {
        if (x < 0) return false;

        int temp = x;
        int rev = 0;

        while (x > 0)
        {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return temp == rev;
    }

    public static void main(String[] args) 
    {
        LC0009 sol = new LC0009();

        int number = 121;

        if (sol.isPalindrome(number))
        {
            System.out.println(number + " is a Palindrome");
        }
        else
        {
            System.out.println(number + " is NOT a Palindrome");
        }
    }
}
