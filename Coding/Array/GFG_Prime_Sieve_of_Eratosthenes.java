package Array;

public class GFG_Prime_Sieve_of_Eratosthenes 
{

    static void sieve(int n) 
    {

        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) isPrime[i] = true;

        // Step 2: mark multiples
        for (int i = 2; i * i <= n; i++) 
        {
            if (isPrime[i]) 
            {
                for (int j = i * i; j <= n; j = j + i)  isPrime[j] = false;
            }
        }

        // Step 3: print primes
        for (int i = 2; i <= n; i++) if (isPrime[i]) System.out.print(i + " ");

    }

    public static void main(String[] args) {
        int n = 10;
        sieve(n);
    }
}
// 2 3 5 7 