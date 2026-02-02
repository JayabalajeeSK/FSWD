package Basics_Java.Problems.Basic;


public class B4_FactorialProgram 
{

    public static long factorial(int n) 
    {
        long fact = 1;
        for (int i = 1; i <= n; i++) fact = fact * i;
        return fact;
    }

    public static void factorialSeries(int n) 
    {
        for (int i = 1; i <= n; i++) 
        {
            System.out.print(factorial(i) + " ");
        }
        System.out.println();
    }

    public static long sumOfFactorials(int n) 
    {
        long sum = 0;
        for (int i = 1; i <= n; i++) sum = sum + factorial(i);
        return sum;
    }

    public static void main(String[] args) 
    {
        int n = 5;
        System.out.println(n + "! = " + factorial(n));
        System.out.print("Factorial Series: "); factorialSeries(n);
        System.out.println("Sum of Factorials = " + sumOfFactorials(n));
    }
}
// 5! = 120
// Factorial Series: 1 2 6 24 120 
// Sum of Factorials = 153