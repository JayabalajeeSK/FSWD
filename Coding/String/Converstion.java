package String;

public class Converstion {

    public static void main(String[] args) {

        System.out.println("===== 1. Implicit Casting (Widening, low → high) =====");
        byte b = 10;
        short s = b;          // byte → short
        int i = s;            // short → int
        long l = i;           // int → long
        float f = l;          // long → float
        double d = f;         // float → double
        System.out.println("byte: " + b + ", short: " + s + ", int: " + i + ", long: " + l + ", float: " + f + ", double: " + d);

        System.out.println("\n===== 2. Explicit Casting (Narrowing, high → low) =====");
        double dx = 123.456;
        float fx = (float) dx;
        long lx = (long) dx;
        int ix = (int) dx;
        short sx = (short) dx;
        byte bx = (byte) dx;
        System.out.println("double: " + dx + ", float: " + fx + ", long: " + lx + ", int: " + ix + ", short: " + sx + ", byte: " + bx);

        System.out.println("\n===== 3. Conversions Using Wrapper Methods =====");
        String strInt = "100";
        String strDouble = "12.34";
        int parseInt = Integer.parseInt(strInt);           // String → int
        double parseDouble = Double.parseDouble(strDouble); // String → double
        String intToStr = String.valueOf(parseInt);       // int → String
        String doubleToStr = String.valueOf(parseDouble); // double → String
        System.out.println("String to int: " + parseInt + ", String to double: " + parseDouble);
        System.out.println("int to String: " + intToStr + ", double to String: " + doubleToStr);

        System.out.println("\n===== 4. Char Conversions =====");
        char c = 'A';
        int charToInt = c;            // char → int (ASCII)
        char intToChar = (char) 66;   // int → char
        String charToStr = String.valueOf(c); // char → String
        char strToChar = "Z".charAt(0);      // String → char
        System.out.println("char: " + c + ", char → int: " + charToInt + ", int → char: " + intToChar);
        System.out.println("char → String: " + charToStr + ", String → char: " + strToChar);

        System.out.println("\n===== 5. Decimal ↔ Binary / Octal / Hex =====");
        int num = 42;
        String bin = Integer.toBinaryString(num);
        String oct = Integer.toOctalString(num);
        String hex = Integer.toHexString(num);
        int fromBin = Integer.parseInt(bin, 2);
        int fromOct = Integer.parseInt(oct, 8);
        int fromHex = Integer.parseInt(hex, 16);
        System.out.println("Decimal: " + num + ", Binary: " + bin + ", Octal: " + oct + ", Hex: " + hex);
        System.out.println("Binary → Decimal: " + fromBin + ", Octal → Decimal: " + fromOct + ", Hex → Decimal: " + fromHex);

        System.out.println("\n===== 6. Float / Double ↔ String =====");
        float fl = 9.87f;
        double db = 123.456;
        String floatStr = String.valueOf(fl);
        String doubleStr = String.valueOf(db);
        float strToFloat = Float.parseFloat(floatStr);
        double strToDouble = Double.parseDouble(doubleStr);
        System.out.println("float: " + fl + ", float → String: " + floatStr + ", String → float: " + strToFloat);
        System.out.println("double: " + db + ", double → String: " + doubleStr + ", String → double: " + strToDouble);

        System.out.println("\n===== 7. Boolean ↔ String =====");
        boolean bool = true;
        String boolStr = String.valueOf(bool);
        boolean strToBool = Boolean.parseBoolean("true");
        System.out.println("boolean: " + bool + ", boolean → String: " + boolStr + ", String → boolean: " + strToBool);

        System.out.println("\n===== 8. Long ↔ String =====");
        long longVal = 9876543210L;
        String longStr = String.valueOf(longVal);
        long strToLong = Long.parseLong(longStr);
        System.out.println("long: " + longVal + ", long → String: " + longStr + ", String → long: " + strToLong);
    }
}
// ===== 1. Implicit Casting (Widening, low ? high) =====
// byte: 10, short: 10, int: 10, long: 10, float: 10.0, double: 10.0

// ===== 2. Explicit Casting (Narrowing, high ? low) =====
// double: 123.456, float: 123.456, long: 123, int: 123, short: 123, byte: 123

// ===== 3. Conversions Using Wrapper Methods =====
// String to int: 100, String to double: 12.34
// int to String: 100, double to String: 12.34

// ===== 4. Char Conversions =====
// char: A, char ? int: 65, int ? char: B
// char ? String: A, String ? char: Z

// ===== 5. Decimal ? Binary / Octal / Hex =====
// Decimal: 42, Binary: 101010, Octal: 52, Hex: 2a
// Binary ? Decimal: 42, Octal ? Decimal: 42, Hex ? Decimal: 42

// ===== 6. Float / Double ? String =====
// float: 9.87, float ? String: 9.87, String ? float: 9.87
// double: 123.456, double ? String: 123.456, String ? double: 123.456

// ===== 7. Boolean ? String =====
// boolean: true, boolean ? String: true, String ? boolean: true

// ===== 8. Long ? String =====
// long: 9876543210, long ? String: 9876543210, String ? long: 9876543210