package Math;

public class Fibonnacci {

    /* ---------------- ITERATIVE METHODS ---------------- */

    // 1. Print Fibonacci series till n terms (Iterative, loop starts from 2)
    static void printFibonacciIterative(int n) 
    {
        if (n <= 0) return;

        int a = 0, b = 1, c = 0;
        System.out.print("Fibonacci Series (Iterative): " + a + " "); // first

        if (n == 1) { System.out.println(); return; }

        System.out.print(b + " "); // second
        for (int i = 2; i < n; i++) 
        { // loop starts from 2
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    // 2. Nth Fibonacci (Iterative, your exact style)
    static int nthFibonacciIterative(int n) 
    {
        if (n <= 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i < n; i++) 
        { // loop starts from 2
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    // 3. Sum of Fibonacci till n terms (Iterative, loop starts from 2, same style)
    static int sumFibonacciIterative(int n) 
    {
        if (n <= 0) return 0;
        if (n == 1) return 0; // only first term

        int a = 0, b = 1, c=0, sum = a + b; // sum first two numbers
        for (int i = 2; i < n; i++) { // loop starts from 2
            c = a + b;
            sum = sum + c;
            a = b;
            b = c;
        }
        return sum;
    }

    /* ---------------- RECURSIVE METHODS ---------------- */

    // // 4. Nth Fibonacci (Recursive)
    // static int fibonacciRecursive(int n) 
    // {
    //     if (n <= 0) return 0;
    //     if (n == 1) return 0;
    //     if (n == 2) return 1;


    //     return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    // }

    // // 5. Print Fibonacci series till n terms (Recursive)
    // static void printFibonacciRecursive(int n) 
    // {
    //     System.out.print("Fibonacci Series (Recursive): ");
    //     for (int i = 1; i <= n; i++) 
    //     {
    //         System.out.print(fibonacciRecursive(i) + " ");
    //     }
    //     System.out.println();
    // }

    // // 6. Sum of Fibonacci till n terms (Recursive)
    // static int sumFibonacciRecursive(int n) 
    // {
    //     if (n <= 0) return 0;
    //     if (n == 1) return 0;
    //     if (n == 2) return 1;

    //     return fibonacciRecursive(n - 1) + sumFibonacciRecursive(n - 1);
    // }

    /* ---------------- MAIN METHOD ---------------- */

    public static void main(String[] args) {

        int n = 9;

        // Iterative
        printFibonacciIterative(n);
        System.out.println(n+"th Fibonacci (Iterative): " + nthFibonacciIterative(n));
        System.out.println("Sum of Fibonacci (Iterative): " + sumFibonacciIterative(n));

        System.out.println();

        // // Recursive
        // printFibonacciRecursive(n);
        // System.out.println(n+"th Fibonacci (Recursive): " + fibonacciRecursive(n));
        // System.out.println("Sum of Fibonacci (Recursive): " + sumFibonacciRecursive(n));
    }
}
