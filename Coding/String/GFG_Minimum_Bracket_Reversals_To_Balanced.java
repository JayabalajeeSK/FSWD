package String;

public class GFG_Minimum_Bracket_Reversals_To_Balanced
{
    public static int minReversals(String s)
    {
        int n = s.length();

        // If length is odd, not possible
        if (n % 2 != 0)
            return -1;

        int open = 0;
        int close = 0;

        for (char ch : s.toCharArray())
        {
            if (ch == '{')
            {
                open++;
            }
            else
            {
                if (open > 0)
                    open--;   // matched pair
                else
                    close++;  // unmatched closing
            }
        }

        // ceil(open/2) + ceil(close/2)
        return (open + 1) / 2 + (close + 1) / 2;
    }
        public static void main(String[] args) {
        String expr = "}{{}}{{{";
        String expr1 = "{{}{{{}{{}}{{";
        String expr2 = "{{";
        System.out.println(minReversals(expr));  //3
        System.out.println(minReversals(expr1));  //-1
        System.out.println(minReversals(expr2));  //1
    }
}

