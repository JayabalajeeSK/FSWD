package Math;

class Solution 
{

    static boolean isPerfect(int n) 
    {
        if (n <= 1) 
        {
            System.out.println("No proper divisors");
            return false;
        }

        int sum = 0;

        System.out.print("Proper divisors of " + n + " are: ");

        for (int i = 1; i <= n / 2; i++) 
        {
            if (n % i == 0) 
            {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }

        System.out.println("\nSum of divisors = " + sum);

        return sum == n;
    }

    public static void main(String[] args) 
    {

        int n = 6;

        if (isPerfect(n)) 
        {
            System.out.println(n + " is a Perfect Number");
        } 
        else 
        {
            System.out.println(n + " is NOT a Perfect Number");
        }
    }
}
// Proper divisors of 6 are: 1 2 3 
// Sum of divisors = 6
// 6 is a Perfect Number