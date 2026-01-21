package String;

public class GFG_Boyer_Moore_Algorithm_Pattern_Searching
{
    static void search(String txt, String pat)
    {
        int n = txt.length();
        int m = pat.length();

        int[] bad = new int[256];

        // initialize bad character table
        for (int i = 0; i < 256; i++) bad[i] = -1;

        // store last occurrence of each character in pattern
        for (int i = 0; i < m; i++) bad[pat.charAt(i)] = i;

        int shift = 0;

        while (shift <= n - m)
        {
            int j = m - 1;

            // compare from right
            while (j >= 0 && pat.charAt(j) == txt.charAt(shift + j)) j--;

            // pattern found
            if (j < 0)
            {
                System.out.println("Pattern found at index " + shift);
                shift += (shift + m < n) ? m - bad[txt.charAt(shift + m)] : 1;
            }
            else
            {
                shift += Math.max(1, j - bad[txt.charAt(shift + j)]);
            }
        }
    }
    public static void main(String[] args)
    {
        String txt = "THIS IS A TEST TEXT";
        String pat = "TEST";
        search(txt, pat);
        
        String txt1 =  "AABAACAADAABAABA";
        String pat1 =  "AABA";
        search(txt1, pat1);
    }
}

