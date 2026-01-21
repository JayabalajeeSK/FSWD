package Math;

import java.util.Scanner;

public class Count_Sum_Last_DigitOperations {

    // ---------- Last Digit ----------
    static int lastDigit(int num) 
    {
        return Math.abs(num % 10);
    }

    // ---------- Sum of Digits ----------
    static int sumOfDigits(int num) 
    {
        int sum = 0;
        num = Math.abs(num);

        while (num > 0) 
        {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

    // ---------- Count of Digits ----------
    static int countDigits(int num) 
    {
        if (num == 0) return 1;

        num = Math.abs(num);
        int count = 0;

        while (num > 0) 
        {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Last digit = " + lastDigit(num));
        System.out.println("Sum of digits = " + sumOfDigits(num));
        System.out.println("Count of digits = " + countDigits(num));

        sc.close();
    }
}
// Enter a number: 12345
// Last digit = 5
// Sum of digits = 15
// Count of digits = 5