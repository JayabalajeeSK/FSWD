package Interview.Easy.D1_0001_0100;

public class LC0013 
{
    public int romanToInt(String s)
    {
        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--)
        {
            int curr = getValue(s.charAt(i));

            if (curr < prev)
                total = total - curr;
            else
                total = total + curr;

            prev = curr;
        }
        return total;
    }

    public int getValue(char c)
    {
        switch (c)
        {
            case 'I': return 1; 
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        LC0013 sol = new LC0013();

        String roman = "MCMXCIV"; // 1994

        int result = sol.romanToInt(roman);

        System.out.println("Roman: " + roman);
        System.out.println("Integer: " + result);
    }
}
