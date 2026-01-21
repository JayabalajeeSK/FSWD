package Math;

public class Factorial 
{

    /* ---------------- ITERATIVE FACTORIAL ---------------- */
    static long factorialIterative(int n) 
    {
        if (n < 0) return -1; // factorial not defined for negative
        long fact = 1;

        for (int i = 2; i <= n; i++) //i = 1 or 2
        { // loop starts from 2
            fact = fact * i;
        }
        return fact;
    }

    /* ---------------- RECURSIVE FACTORIAL ---------------- */
    static long factorialRecursive(int n) 
    {
        if (n < 0) return -1; // factorial not defined
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    /* ---------------- DYNAMIC FACTORIAL (Bottom-up DP) ---------------- */
    static long factorialDP(int n) 
    {
        if (n < 0) return -1; // factorial not defined

        long[] dp = new long[n + 1];

        dp[0] = 1; // 0! = 1
        for (int i = 1; i <= n; i++) 
        {
            dp[i] = dp[i - 1] * i;
        }
        return dp[n];
    }

    /* ---------------- MAIN METHOD ---------------- */
    public static void main(String[] args) {

        int n = 10;

        System.out.println("Factorial of " + n + " (Iterative): " + factorialIterative(n));
        System.out.println("Factorial of " + n + " (Recursive): " + factorialRecursive(n));
        System.out.println("Factorial of " + n + " (Dynamic/DP): " + factorialDP(n));
    }
}
// Factorial of 10 (Iterative): 3628800
// Factorial of 10 (Recursive): 3628800
// Factorial of 10 (Dynamic/DP): 3628800