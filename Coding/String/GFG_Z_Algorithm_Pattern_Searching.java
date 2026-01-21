package String;

import java.util.*;

public class GFG_Z_Algorithm_Pattern_Searching
{
    static List<Integer> search(String text, String pattern)
    {
        List<Integer> result = new ArrayList<>();

        String concat = pattern + "$" + text;
        int n = concat.length();
        int[] Z = new int[n];

        int L = 0, R = 0;

        for (int i = 1; i < n; i++)
        {
            if (i <= R)
                Z[i] = Math.min(R - i + 1, Z[i - L]);

            while (i + Z[i] < n &&
                   concat.charAt(Z[i]) == concat.charAt(i + Z[i]))
            {
                Z[i]++;
            }

            if (i + Z[i] - 1 > R)
            {
                L = i;
                R = i + Z[i] - 1;
            }
        }

        int pLen = pattern.length();

        for (int i = 0; i < n; i++)
        {
            if (Z[i] == pLen)
            {
                result.add(i - pLen - 1);
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        String text = "aabxaabxaa";
        String pattern = "aab";

        System.out.println(search(text, pattern)); //[0, 4]
    }
}

