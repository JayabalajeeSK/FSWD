package Math;

import java.util.Scanner;

public class PrimeNumbers 
{

    // ---------- 1. Check Prime ----------
    static boolean isPrime(int n) //must
    {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) 
        {
            if (n % i == 0) return false;
        }
        return true;
    }

    // ---------- 2. Print First N Prime Numbers ----------
    static void printNPrimes(int n) 
    {
        int count = 0;
        int num = 2;

        System.out.print("First " + n + " prime numbers: ");
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

    // ---------- 3. Find Nth Prime ----------
    static int nthPrime(int n) 
    {
        int count = 0;
        int num = 2;

        while (true) {
            if (isPrime(num)) 
            {
                count++;

                if (count == n) return num;
            }
            num++;
        }
    }

    // ---------- Main (for testing) ----------
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check prime: ");
        int x = sc.nextInt();
        System.out.println(x + " is Prime? " + isPrime(x));

        System.out.print("\nEnter N to print primes: ");
        int n = sc.nextInt();
        printNPrimes(n);

        System.out.print("\nEnter N to find Nth prime: ");
        int k = sc.nextInt();
        System.out.println("Nth Prime = " + nthPrime(k));

        sc.close();
    }
}
// Enter number to check prime: 11
// 11 is Prime? true

// Enter N to print primes: 9
// First 9 prime numbers: 2 3 5 7 11 13 17 19 23 

// Enter N to find Nth prime: 11
// Nth Prime = 31