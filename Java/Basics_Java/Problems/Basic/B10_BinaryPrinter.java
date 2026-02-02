package Basics_Java.Problems.Basic;

public class B10_BinaryPrinter 
{

    // Method to print binary of byte (8 bits)
    public static String toBinary(byte b) 
    {
        return String.format("%8s", Integer.toBinaryString(b & 0xFF)).replace(' ', '0');
    }

    // Method to print binary of int (32 bits)
    public static String toBinary(int i) 
    {
        return String.format("%32s", Integer.toBinaryString(i)).replace(' ', '0');
    }

    // Method to print binary of long (64 bits)
    public static String toBinary(long l) 
    {
        return String.format("%64s", Long.toBinaryString(l)).replace(' ', '0');
    }

    public static void main(String[] args) 
    {
        byte b = 10;
        int i = 12345;
        long l = 123456789L;

        System.out.println("Byte value: " + b + " → Binary: " + toBinary(b));
        System.out.println("Int value: " + i + " → Binary: " + toBinary(i));
        System.out.println("Long value: " + l + " → Binary: " + toBinary(l));

        // Test negative numbers
        int negInt = -12345;
        long negLong = -123456789L;
        System.out.println("Negative Int: " + negInt + " → Binary: " + toBinary(negInt));
        System.out.println("Negative Long: " + negLong + " → Binary: " + toBinary(negLong));
    }
}
// Byte value: 10 ? Binary: 00001010
// Int value: 12345 ? Binary: 00000000000000000011000000111001
// Long value: 123456789 ? Binary: 0000000000000000000000000000000000000111010110111100110100010101
// Negative Int: -12345 ? Binary: 11111111111111111100111111000111
// Negative Long: -123456789 ? Binary: 1111111111111111111111111111111111111000101001000011001011101011

