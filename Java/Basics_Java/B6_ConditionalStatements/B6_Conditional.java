package Basics_Java.B6_ConditionalStatements;

public class B6_Conditional 
{

    public static void main(String[] args) 
    {

        int number = 75;

        // IF
        if (number > 0)
            System.out.println("Positive Number");

        // IF-ELSE
        if (number % 2 == 0) System.out.println("Even");
        else System.out.println("Odd");

        // NESTED IF
        if (number > 50) 
        {
            if (number < 100) 
            {
                System.out.println("Between 50 and 100");
            }
        }

        // ELSE-IF LADDER
        if (number >= 90) System.out.println("A Grade");
        else if (number >= 60) System.out.println("B Grade");
        else System.out.println("C Grade");

        // SWITCH CASE
        int option = 3;
        switch (option) 
        {
            case 1: System.out.println("Option One"); break;
            case 2: System.out.println("Option Two"); break;
            case 3: System.out.println("Option Three"); break;
            default: System.out.println("Invalid Option");
        }
    }
}
// Positive Number
// Odd
// Between 50 and 100
// B Grade
// Option Three