package String;
public class GFG_Circle_of_Strings
{
    static int isCircle(String[] arr)
    {
        int[] in = new int[26];
        int[] out = new int[26];
        boolean[] present = new boolean[26];

        // Build in-degree and out-degree
        for (String s : arr)
        {
            int first = s.charAt(0) - 'a';
            int last = s.charAt(s.length() - 1) - 'a';

            out[first]++;
            in[last]++;

            present[first] = true;
            present[last] = true;
        }

        // Check in-degree == out-degree
        for (int i = 0; i < 26; i++)
        {
            if (in[i] != out[i])
                return 0;
        }

        return 1;
    }
    public static void main(String[] args)
    {
        String[] a1 = {"abc", "bcd", "cdf"};
        String[] a2 = {"ab", "bc", "cd", "da"};

        System.out.println(isCircle(a1)); // 0
        System.out.println(isCircle(a2)); // 1
    }
}