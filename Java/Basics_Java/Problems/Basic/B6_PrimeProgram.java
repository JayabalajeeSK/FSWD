package Basics_Java.Problems.Basic;

public class B6_PrimeProgram 
{

    public static boolean isPrime(int n) 
    {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) 
        { // or i <= n/2
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void firstNPrimes(int n) 
    {
        int count = 0, num = 2;
        while (count < n) 
        {
            if (isPrime(num)) 
            { 
                System.out.print(num + " "); 
                count++; 
            }
            num++;
        }
        System.out.println();
    }

    public static int nthPrime(int n) 
    {
        int count = 0, num = 2;
        while (true) 
        {
            if (isPrime(num)) count++;

            if (count == n) return num;
            num++;
        }
    }

    public static int sumOfNPrimes(int n) 
    {
        int sum = 0, count = 0, num = 2;
        while (count < n) 
        {
            if (isPrime(num)) 
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
        int n = 17;
        System.out.println("Is Prime: " + isPrime(n));
        System.out.print("First " + n + " primes: "); firstNPrimes(n);
        System.out.println("Nth Prime: " + nthPrime(n));
        System.out.println("Sum of first " + n + " primes = " + sumOfNPrimes(n));
    }
}
// Is Prime: true
// First 17 primes: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 
// Nth Prime: 59
// Sum of first 17 primes = 440