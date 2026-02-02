package Basics_Java.B3_DatatypesAndCasting;

public class B3_ImplicitWideningExample {
    public static void main(String[] args) {
        byte b = 10;
        int i = b;        // byte → int
        long l = i;       // int → long
        float f = l;      // long → float
        double d = f;     // float → double

        System.out.println("byte: " + b);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
    }
}

// byte: 10
// int: 10
// long: 10
// float: 10.0
// double: 10.0