package Math;

import java.util.Scanner;

public class LCM_GCD 
{

    // ---------- GCD of 2 numbers ----------
    static int gcd(int a, int b) 
    {
        while (b != 0) 
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // ---------- LCM of 2 numbers ----------
    static int lcm(int a, int b) 
    {
        return (a * b) / gcd(a, b);
    }

    // ---------- GCD of N numbers (array) ----------
    static int gcdArray(int[] arr) 
    {
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) 
        {
            result = gcd(result, arr[i]);
        }
        return result;
    }

    // ---------- LCM of N numbers (array) ----------
    static int lcmArray(int[] arr) 
    {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            result = lcm(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // ----- 2 numbers -----
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("GCD (HCF) of " + a + " and " + b + " = " + gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " = " + lcm(a, b));

        // ----- N numbers -----
        System.out.print("\nEnter how many numbers: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("GCD (HCF) of array = " + gcdArray(arr));
        System.out.println("LCM of array = " + lcmArray(arr));

        sc.close();
    }
}
// Enter first number: 12
// Enter second number: 18
// GCD (HCF) of 12 and 18 = 6
// LCM of 12 and 18 = 36

// Enter how many numbers: 3
// Enter the numbers:
// 12 18 24
// GCD (HCF) of array = 6
// LCM of array = 72