package Math;

import java.util.Scanner;

public class Armstrong {

    // ---------- Count digits ----------
    static int countDigits(int n) //must
    {
        int count = 0;
        while (n > 0) 
        {
            count++;
            n = n / 10;
        }
        return count;
    }

    // ---------- Power without Math.pow ----------
    static int power(int base, int exp)  //must
    {
        int result = 1;
        for (int i = 1; i <= exp; i++) 
        {
            result = result * base;
        }
        return result;
    }

    // ---------- 1. Check Armstrong ----------
    static boolean isArmstrong(int n) 
    {
        int temp = n;
        int digits = countDigits(n);
        int sum = 0;

        while (temp > 0) 
        {
            int digit = temp % 10;
            sum = sum + power(digit, digits);
            temp = temp / 10;
        }
        return sum == n;
    }

    // ---------- 2. Print First N Armstrong Numbers ----------
    static void printNArmstrong(int n) 
    {
        int count = 0;
        int num = 1;

        System.out.print("First " + n + " Armstrong numbers: ");
        while (count < n) 
        {
            if (isArmstrong(num)) 
            {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    // ---------- 3. Find Nth Armstrong ----------
    static int nthArmstrong(int n) 
    {
        int count = 0;
        int num = 1;

        while (true) 
        {
            if (isArmstrong(num)) 
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

        System.out.print("Enter number to check Armstrong: ");
        int x = sc.nextInt();
        System.out.println(x + " is Armstrong? " + isArmstrong(x));

        System.out.print("\nEnter N to print Armstrong numbers: ");
        int n = sc.nextInt();
        printNArmstrong(n);

        System.out.print("\nEnter N to find Nth Armstrong: ");
        int k = sc.nextInt();
        System.out.println("Nth Armstrong = " + nthArmstrong(k));

        sc.close();
    }
}
// Enter number to check Armstrong: 153
// 153 is Armstrong? true

// Enter N to print Armstrong numbers: 19
// First 19 Armstrong numbers: 1 2 3 4 5 6 7 8 9 153 370 371 407 1634 8208 9474 54748 92727 93084 

// Enter N to find Nth Armstrong: 19
// Nth Armstrong = 93084