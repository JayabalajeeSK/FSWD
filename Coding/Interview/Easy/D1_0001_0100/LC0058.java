package Interview.Easy.D1_0001_0100;

public class LC0058 {

    public int lengthOfLastWord(String s) 
    {
        // String[] str = s.trim().split(" ");
        // return str[str.length -1].length();

        int len = 0;
        int i = s.length() - 1;


        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') 
        {
            i--;
        }

        // Count last word characters
        while (i >= 0 && s.charAt(i) != ' ') 
        {
            len++;
            i--;
        }

        return len;
    }

    public static void main(String[] args) 
    {
        LC0058 sol = new LC0058();

        String input = "Hello World   ";
        int result = sol.lengthOfLastWord(input);

        System.out.println("Length of last word: " + result);
    }
}
