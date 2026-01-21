package String;

public class LC0012_Integer_to_Roman 
{

    // Method to convert integer to Roman numeral
    public String intToRoman(int num) 
    {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = 
        {
            "M", "CM", "D", "CD", "C", "XC",
            "L", "XL", "X", "IX", "V", "IV", "I"
        };

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) 
        {
            while (num >= values[i]) 
            {
                num = num - values[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }

    // MAIN METHOD to test locally
    public static void main(String[] args) 
    {
        LC0012_Integer_to_Roman sol = new LC0012_Integer_to_Roman();

        // Test cases
        int n1 = 3;
        int n2 = 58;
        int n3 = 1994;

        System.out.println(n1 + " -> " + sol.intToRoman(n1));   // III
        System.out.println(n2 + " -> " + sol.intToRoman(n2));   // LVIII
        System.out.println(n3 + " -> " + sol.intToRoman(n3));   // MCMXCIV
    }
}
