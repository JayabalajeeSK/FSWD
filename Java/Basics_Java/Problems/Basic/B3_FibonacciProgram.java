package Basics_Java.Problems.Basic;


public class B3_FibonacciProgram 
{

    public static boolean isFibonacci(int n) 
    {
        int a = 0, b = 1;
        while (a <= n) {
            if (a == n) return true;
            int c = a + b;
            a = b;
            b = c;
        }
        return false;
    }

    public static int nthFibonacci(int n) 
    {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <n; i++) 
        {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void fibonacciSeries(int n) 
    {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) 
        {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static int sumOfFibonacci(int n) 
    {
        int a = 0, b = 1, sum = 0;
        for (int i = 0; i < n; i++) 
        {
            sum = sum + a;
            int c = a + b;
            a = b;
            b = c;
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        int n = 6;
        System.out.println("Is Fibonacci: " + isFibonacci(n));
        System.out.println("Nth Fibonacci: " + nthFibonacci(n));
        System.out.print("Fibonacci Series: "); fibonacciSeries(n);
        System.out.println("Sum of Fibonacci: " + sumOfFibonacci(n));
    }
}
// Is Fibonacci: false
// Nth Fibonacci: 5
// Fibonacci Series: 0 1 1 2 3 5 
// Sum of Fibonacci: 12