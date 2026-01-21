package String;

public class GFG_Sum_of_All_Numbers_in_String
{
    static int findSum(String str)
    {
        int sum = 0;
        String temp = "";

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (Character.isDigit(ch))
            {
                temp = temp + ch;
            }
            else
            {

                if (!temp.equals(""))
                {
                    sum = sum + Integer.parseInt(temp);
                    temp = "";
                }
            }
        }

        if (!temp.equals(""))
        {
            sum = sum + Integer.parseInt(temp);
        }

        return sum;
    }

    // Main method
    public static void main(String[] args)
    {
        String s1 = "1abc23";
        String s2 = "geeks4geeks";
        String s3 = "12abc20yz68";

        System.out.println(findSum(s1)); // 24
        System.out.println(findSum(s2)); // 4
        System.out.println(findSum(s3)); // 100
    }
}
