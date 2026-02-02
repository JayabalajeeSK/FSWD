package Basics_Java.Problems.Basic;

public class B8_Print 
{

    public static void main(String[] args) 
    {

        int num = 100;
        long lnum = 1234567890L;
        float fnum = 9.8f;
        double dnum = 3.14159;
        char ch = 'A';
        boolean flag = true;
        String str = "Hello, Java!";

        System.out.print("Using print -> Integer: " + num + ", "); 
        System.out.print("Long: " + lnum + ", ");
        System.out.print("Float: " + fnum + ", ");
        System.out.print("Double: " + dnum + ", ");
        System.out.print("Char: " + ch + ", ");
        System.out.print("Boolean: " + flag + ", ");
        System.out.print("String: " + str);
        System.out.println(); // for newline
        // Using print -> Integer: 100, Long: 1234567890, Float: 9.8, Double: 3.14159, Char: A, Boolean: true, String: Hello, Java!


        System.out.println("\nUsing println ->");
        System.out.println("Integer: " + num);
        System.out.println("Long: " + lnum);
        System.out.println("Float: " + fnum);
        System.out.println("Double: " + dnum);
        System.out.println("Char: " + ch);
        System.out.println("Boolean: " + flag);
        System.out.println("String: " + str);
        // Using println ->
        // Integer: 100
        // Long: 1234567890
        // Float: 9.8
        // Double: 3.14159
        // Char: A
        // Boolean: true
        // String: Hello, Java!

        System.out.println("\nUsing printf ->");
        System.out.printf("Integer: %d\n", num);
        System.out.printf("Long: %d\n", lnum);
        System.out.printf("Float: %.2f\n", fnum); // 2 decimal places
        System.out.printf("Double: %.3f\n", dnum); // 3 decimal places
        System.out.printf("Char: %c\n", ch);
        System.out.printf("Boolean: %b\n", flag);
        System.out.printf("String: %s\n", str);
        // Using printf ->
        // Integer: 100
        // Long: 1234567890
        // Float: 9.80
        // Double: 3.142
        // Char: A
        // Boolean: true
        // String: Hello, Java!

        // ----------------- Escape Characters ----------------- R to L
        System.out.println("\nEscape Characters Examples ->");
        System.out.println("Newline \\n example:\nHello World!"); //Newline \n example:
        System.out.println("Tab \\t example:\tHello\tWorld!"); //Tab \t example: Hello   World!
        System.out.println("Backslash \\\\ example: C:\\Program Files\\Java"); //Backslash \\ example: C:\Program Files\Java
        System.out.println("Double Quote \\\" example: \"Java Programming\""); //Double Quote \" example: "Java Programming"
        System.out.println("Single Quote \\\' example: \'A\'"); //Single Quote \' example: 'A'
    }
}

