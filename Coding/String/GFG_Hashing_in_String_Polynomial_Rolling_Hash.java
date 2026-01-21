package String;

public class GFG_Hashing_in_String_Polynomial_Rolling_Hash
{
    static long getHash(String str)
    {
        long hash = 0;
        long p = 31;
        long m = 1000000007;
        long power = 1;

        for (int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i) - 'a' + 1;  // FIX
            hash = (hash + val * power) % m;
            power = (power * p) % m;
        }

        return hash;
    }
    public static void main(String[] args)
    {
        System.out.println(getHash("geeksforgeeks")); //609871790
        System.out.println(getHash("polynomial")); //948934983
    }
}
