package Interview.Easy.D1_0001_0100;

import java.math.BigInteger;

public class LC0067 
{
    public String addBinary(String a, String b) 
    {
        return new BigInteger(a, 2)
                .add(new BigInteger(b, 2))
                .toString(2);
    }

    // main method
    public static void main(String[] args) 
    {
        LC0067 obj = new LC0067();

        String a = "1010";
        String b = "1011";

        String result = obj.addBinary(a, b);

        System.out.println("Binary A : " + a);
        System.out.println("Binary B : " + b);
        System.out.println("Result   : " + result);
    }
}

