package Basics_Java.B3_DatatypesAndCasting;

public class B3_Explicit_NarrowingExample {
    public static void main(String[] args) {
        double d = 100.99;
        float f = (float) d;  // double → float
        long l = (long) f;    // float → long
        int i = (int) l;      // long → int
        byte b = (byte) i;    // int → byte

        System.out.println("double: " + d);
        System.out.println("float: " + f);
        System.out.println("long: " + l);
        System.out.println("int: " + i);
        System.out.println("byte: " + b);
    }
}
// double: 100.99
// float: 100.99
// long: 100
// int: 100
// byte: 100