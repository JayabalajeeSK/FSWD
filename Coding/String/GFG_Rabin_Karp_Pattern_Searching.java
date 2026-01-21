package String;

public class GFG_Rabin_Karp_Pattern_Searching
{
    static void search(String text, String pat)
    {
        int n = text.length();
        int m = pat.length();

        int pHash = 0, tHash = 0;
        int d = 256, q = 101, h = 1;

        // calculate h = d^(m-1) % q
        for (int i = 0; i < m - 1; i++) h = (h * d) % q;

        // initial hash
        for (int i = 0; i < m; i++)
        {
            pHash = (pHash * d + pat.charAt(i)) % q;
            tHash = (tHash * d + text.charAt(i)) % q;
        }

        for (int i = 0; i <= n - m; i++)
        {
            if (pHash == tHash)   // hash match
            {
                int j = 0;

                while (j < m && text.charAt(i + j) == pat.charAt(j)) j++;

                if (j == m) System.out.println("Pattern found at index " + i);
            }

            // rolling hash
            if (i < n - m)
            {
                tHash = (tHash - text.charAt(i) * h) * d + text.charAt(i + m);

                tHash = tHash % q;

                if (tHash < 0) tHash = tHash + q;
            }
        }
    }
    public static void main(String[] args)
    {
        search("aabaacaadaabaaba", "aaba");
        search("geeksforgeeks", "geeks");
    }
}
