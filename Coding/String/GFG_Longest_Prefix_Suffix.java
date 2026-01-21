package String;
public class GFG_Longest_Prefix_Suffix
{
    static int getLPSLength(String s)
    {
        int n = s.length();
        int[] lps = new int[n];

        int len = 0;   // length of previous longest prefix suffix
        int i = 1;

        while (i < n)
        {
            if (s.charAt(i) == s.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                if (len != 0)
                {
                    len = lps[len - 1];
                }
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps[n - 1];
    }

    public static void main(String[] args)
    {
        System.out.println(getLPSLength("abab"));        // 2
        System.out.println(getLPSLength("aabcdaabc"));  // 4
        System.out.println(getLPSLength("aaaa"));        // 3
    }
}

