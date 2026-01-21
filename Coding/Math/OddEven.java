package Math;
public class OddEven 
{

    static void checkOddEven(int num) 
    {
        if (num % 2 == 0) System.out.println(num + " is Even");
        else System.out.println(num + " is Odd");
    }

    static void printEven(int n) 
    {
        System.out.print("Even numbers: ");

        for (int i = 1; i <= n; i++) System.out.print(i * 2 + " ");
        
        System.out.println();
    }

    static void printOdd(int n) 
    {
        System.out.print("Odd numbers: ");

        for (int i = 0; i < n; i++) System.out.print(2 * i + 1 + " ");

        System.out.println();
    }

    public static void main(String[] args) 
    {
        checkOddEven(15);
        printEven(5);
        printOdd(5);
    }
}
// 15 is Odd
// Even numbers: 2 4 6 8 10 
// Odd numbers: 1 3 5 7 9 