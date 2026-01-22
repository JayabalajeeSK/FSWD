package Interview.Easy.D1_0001_0100;

public class LC0069 
{
    public int mySqrt(int x) 
    {
        if (x == 0 || x == 1) return x;

        int i = 1;
        while (i * i <= x) 
        {
            i++;
        }

        return i - 1; // the last number whose square <= x
    }

    // main method
    public static void main(String[] args) {
        LC0069 obj = new LC0069();

        System.out.println(obj.mySqrt(8));   // 2
        System.out.println(obj.mySqrt(16));  // 4
        System.out.println(obj.mySqrt(25));  // 5
        System.out.println(obj.mySqrt(1));   // 1
        System.out.println(obj.mySqrt(0));   // 0
        System.out.println(obj.mySqrt(5));   // 0
        System.out.println((int)Math.sqrt(4)); //2
        System.out.println(Math.sqrt(4)); //2.0
    }
}

