package Basics_Java.Problems.Basic;

import java.util.Scanner;

public class B12_LCM_GCF {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if(n < 2) 
        {
            System.out.println("Enter at least 2 numbers.");
            sc.close();
            return;
            
        }

        int[] numbers = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < n; i++) 
        {
            numbers[i] = sc.nextInt();
        }

        int hcf = findHCF(numbers);
        int lcm = findLCM(numbers);

        System.out.println("\nResults:");
        System.out.println("HCF/GCF of numbers = " + hcf);
        System.out.println("LCM of numbers = " + lcm);

        sc.close();
    }

    // HCF of two numbers using Euclidean Algorithm
    public static int findHCF(int a, int b) 
    {
        a = Math.abs(a);
        b = Math.abs(b);
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM of two numbers using formula
    public static int findLCM(int a, int b) 
    {
        a = Math.abs(a);
        b = Math.abs(b);
        return (a * b) / findHCF(a, b);
    }

    // HCF of multiple numbers
    public static int findHCF(int[] arr) 
    {
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) 
        {
            result = findHCF(result, arr[i]);
        }
        return result;
    }

    // LCM of multiple numbers
    public static int findLCM(int[] arr) 
    {
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) 
        {
            result = findLCM(result, arr[i]);
        }
        return result;
    }
}
// Enter number of elements: 4
// Enter the numbers: 
// 12 18 24 30

// Results:
// HCF/GCF of numbers = 6
// LCM of numbers = 360

// 1️⃣ findHCF(int a, int b)
// public static int findHCF(int a, int b) {
//     a = Math.abs(a);
//     b = Math.abs(b);
//     while(b != 0) {
//         int temp = b;
//         b = a % b;
//         a = temp;
//     }
//     return a;
// }

// Explanation:

// Purpose: Find the HCF (Highest Common Factor) of two numbers using the Euclidean Algorithm.

// Math.abs(a) & Math.abs(b) → ensures it works even for negative numbers.

// Logic:

// Euclidean Algorithm says:

// HCF(a, b) = HCF(b, a % b)

// Keep replacing a with b and b with a % b until b becomes 0.

// When b is 0, a is the HCF.

// Example:

// a = 12, b = 18
// Step1: temp = 18, b = 12 % 18 = 12, a = 18
// Step2: temp = 12, b = 18 % 12 = 6, a = 12
// Step3: temp = 6, b = 12 % 6 = 0, a = 6 → stop
// HCF = 6


// ✅ Efficient for large numbers because it reduces numbers fast.

// 2️⃣ findLCM(int a, int b)
// public static int findLCM(int a, int b) {
//     a = Math.abs(a);
//     b = Math.abs(b);
//     return (a * b) / findHCF(a, b);
// }

// Explanation:

// Purpose: Find LCM (Least Common Multiple) of two numbers.

// Formula used:

// LCM(a, b) = (a * b) / HCF(a, b)


// findHCF(a, b) → calls the first method to get HCF.

// Math.abs() ensures negative numbers are handled correctly.

// Example:

// a = 12, b = 18
// HCF = 6
// LCM = (12 * 18) / 6 = 216 / 6 = 36


// ✅ Works fast because HCF is already efficient.

// 3️⃣ findHCF(int[] arr)
// public static int findHCF(int[] arr) {
//     int result = arr[0];
//     for(int i = 1; i < arr.length; i++) {
//         result = findHCF(result, arr[i]);
//     }
//     return result;
// }

// Explanation:

// Purpose: Find HCF of multiple numbers (more than 2).

// Logic:

// Start with result = arr[0] → first number.

// Loop through remaining numbers:

// result = HCF(result, arr[i])


// After the loop, result contains HCF of all numbers.

// Example:

// arr = {12, 18, 24}
// Step1: result = 12
// Step2: result = HCF(12, 18) = 6
// Step3: result = HCF(6, 24) = 6
// Final HCF = 6


// ✅ Works for any number of inputs efficiently.

// 4️⃣ findLCM(int[] arr)
// public static int findLCM(int[] arr) {
//     int result = arr[0];
//     for(int i = 1; i < arr.length; i++) {
//         result = findLCM(result, arr[i]);
//     }
//     return result;
// }

// Explanation:

// Purpose: Find LCM of multiple numbers.

// Logic:

// Start with first number result = arr[0].

// Loop through remaining numbers:

// result = LCM(result, arr[i])


// LCM of multiple numbers is iterative LCM of two numbers at a time.

// Example:

// arr = {12, 18, 24}
// Step1: result = 12
// Step2: result = LCM(12, 18) = 36
// Step3: result = LCM(36, 24) = 72
// Final LCM = 72


// ✅ This is very efficient and works for any number of integers

// | Method                  | Purpose                 | Works For | Algorithm/Formula              |
// | ----------------------- | ----------------------- | --------- | ------------------------------ |
// | `findHCF(int a, int b)` | HCF of 2 numbers        | 2 numbers | Euclidean Algorithm            |
// | `findLCM(int a, int b)` | LCM of 2 numbers        | 2 numbers | LCM = (a*b)/HCF(a,b)           |
// | `findHCF(int[] arr)`    | HCF of multiple numbers | array     | Iteratively call HCF for pairs |
// | `findLCM(int[] arr)`    | LCM of multiple numbers | array     | Iteratively call LCM for pairs |

