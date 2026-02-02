package Basics_Java.Problems.Basic;

import java.util.Scanner;

public class B11_FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to check and print FizzBuzz up to n: ");
        int n = sc.nextInt();

        System.out.println("\nCheck single number:");
        if(n % 3 == 0 && n % 5 == 0) System.out.println(n + " is FizzBuzz");
        else if(n % 3 == 0) System.out.println(n + " is Fizz");
        else if(n % 5 == 0) System.out.println(n + " is Buzz");
        else System.out.println(n + " is not Fizz or Buzz");

        System.out.println("\nPrint FizzBuzz from 1 to " + n + ":");
        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
        sc.close();
    }
}
// Enter n to check and print FizzBuzz up to n: 15

// Check single number:
// 15 is FizzBuzz

// Print FizzBuzz from 1 to 15:
// 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// 7
// 8
// Fizz
// Buzz
// 11
// Fizz
// 13
// 14
// FizzBuzz