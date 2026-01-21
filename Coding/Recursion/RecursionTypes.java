package Recursion;

public class RecursionTypes 
{

    // 1️⃣ Direct Recursion
    static void directRecursion(int n) 
    {
        if (n == 0) return;
        System.out.print(n + " ");
        directRecursion(n - 1);
    }

    // 2️⃣ Indirect Recursion
    static void indirectA(int n) 
    {
        if (n <= 0) return;
        System.out.print(n + " ");
        indirectB(n - 1);
    }

    static void indirectB(int n) 
    {
        if (n <= 0) return;
        indirectA(n - 1);
    }

    // 3️⃣ Tail Recursion
    static void tailRecursion(int n) 
    {
        if (n == 0) return;
        System.out.print(n + " ");
        tailRecursion(n - 1); // last statement
    }

    // 4️⃣ Non-Tail Recursion
    static int nonTailRecursion(int n) 
    {
        if (n == 0) return 0;
        return n + nonTailRecursion(n - 1); // work after call
    }

    // 5️⃣ Head Recursion
    static void headRecursion(int n) 
    {
        if (n == 0) return;
        headRecursion(n - 1);
        System.out.print(n + " "); // print after call
    }

    // 6️⃣ Linear Recursion
    static int linearRecursion(int n) 
    {
        if (n == 0) return 1;
        return n * linearRecursion(n - 1); // factorial
    }

    // 7️⃣ Tree Recursion
    static int treeRecursion(int n) 
    {
        if (n <= 1) return n;
        return treeRecursion(n - 1) + treeRecursion(n - 2); // Fibonacci
    }

    public static void main(String[] args) 
    {

        System.out.println("Direct Recursion:");
        directRecursion(5);

        System.out.println("\n\nIndirect Recursion:");
        indirectA(5);

        System.out.println("\nTail Recursion:");
        tailRecursion(5);

        System.out.println("\n\nNon-Tail Recursion (Sum):");
        System.out.println(nonTailRecursion(5));

        System.out.println("Head Recursion:");
        headRecursion(5);

        System.out.println("\n\nLinear Recursion (Factorial):");
        System.out.println(linearRecursion(5));

        System.out.println("Tree Recursion (Fibonacci):");
        System.out.println(treeRecursion(6));
    }
}
// Direct Recursion:
// 5 4 3 2 1 

// Indirect Recursion:
// 5 3 1 
// Tail Recursion:
// 5 4 3 2 1

// Non-Tail Recursion (Sum):
// 15
// Head Recursion:
// 1 2 3 4 5

// Linear Recursion (Factorial):
// 120
// Tree Recursion (Fibonacci):
// 8