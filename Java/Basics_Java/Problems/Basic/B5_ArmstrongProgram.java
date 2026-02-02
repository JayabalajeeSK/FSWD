package Basics_Java.Problems.Basic;

public class B5_ArmstrongProgram 
{

    public static int countDigits(int num) 
    {
        int count = 0;
        while (num > 0) 
        { 
            num = num / 10; 
            count++; 
        }
        return count;
    }

    public static boolean isArmstrong(int num) 
    {
        int digits = countDigits(num); //use String.valueof(num).length();
        int sum = 0, temp = num;
        while (temp > 0) 
        {
            int dight = temp % 10;
            sum = (int)(sum + Math.pow(dight, digits)); //sum += Math.pow(dight, digits);
            temp = temp / 10;
        }
        return sum == num;
    }

    public static void printArmstrongUptoN(int n) 
    {
        for (int i = 1; i <= n; i++) 
        {
            if (isArmstrong(i)) 
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static int nthArmstrong(int n) 
    {
        int count = 0, num = 1;
        while (true) 
        {
            if (isArmstrong(num)) count++;
            if (count == n) return num;
            num++;
        }
    }

    public static int sumOfNArmstrong(int n) 
    {
        int count = 0, num = 1, sum = 0;
        while (count < n) 
        {
            if (isArmstrong(num)) 
            { 
                sum = sum + num; 
                count++; 
            }
            num++;
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        int n = 153;
        System.out.println("Is Armstrong: " + isArmstrong(n));
        System.out.print("Armstrong up to " + n + ": "); printArmstrongUptoN(n);
        System.out.println("Nth Armstrong: " + nthArmstrong(5));
        System.out.println("Sum of first 5 Armstrong numbers: " + sumOfNArmstrong(5));
    }
}
// Is Armstrong: true
// Armstrong up to 153: 1 2 3 4 5 6 7 8 9 153 
// Nth Armstrong: 5
// Sum of first 5 Armstrong numbers: 15