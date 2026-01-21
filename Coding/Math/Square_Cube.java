package Math;

import java.util.Scanner;

public class Square_Cube 
{

    // ---------- WITH METHODS ----------

    // square & cube (int)
    static int square(int n) 
    {
        return n * n;
    }

    static int cube(int n) 
    {
        return n * n * n;
    }

    // square root & cube root (double)
    static double squareRootWithMethod(int n) 
    {
        return Math.sqrt(n);
    }

    static double cubeRootWithMethod(int n) 
    {
        return Math.cbrt(n);
    }

    // ---------- WITHOUT METHODS ----------

    // integer square root (logic)
    static int squareRootInt(int n) 
    {
        int i = 0;
        while (i * i <= n) 
        {
            i++;
        }
        return i - 1;
    }

    // integer cube root (logic)
    static int cubeRootInt(int n) 
    {
        int i = 0;
        while (i * i * i <= n) 
        {
            i++;
        }
        return i - 1;
    }

    // square root in double without Math
    static double squareRootDouble(int n) 
    {
        double root = 0;
        for (double i = 0; i * i <= n; i = i + 0.001) 
        {
            root = i;
        }
        return root;
    }

    // cube root in double without Math
    static double cubeRootDouble(int n) 
    {
        double root = 0;
        for (double i = 0; i * i * i <= n; i = i + 0.001) 
        {
            root = i;
        }
        return root;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\n--- WITH METHODS ---");
        System.out.println("Square = " + square(num));
        System.out.println("Cube = " + cube(num));
        System.out.println("Square Root (double) = " + squareRootWithMethod(num));
        System.out.println("Cube Root (double) = " + cubeRootWithMethod(num));

        System.out.println("\n--- WITHOUT METHODS ---");
        System.out.println("Square Root (int) = " + squareRootInt(num));
        System.out.println("Cube Root (int) = " + cubeRootInt(num));
        System.out.println("Square Root (double) = " + squareRootDouble(num));
        System.out.println("Cube Root (double) = " + cubeRootDouble(num));

        sc.close();
    }
}
// Enter a number: 27

// --- WITH METHODS ---
// Square = 729
// Cube = 19683
// Square Root (double) = 5.196152422706632
// Cube Root (double) = 3.0

// --- WITHOUT METHODS ---
// Square Root (int) = 5
// Cube Root (int) = 3
// Square Root (double) = 5.19600000000007
// Cube Root (double) = 2.9999999999997806