package Basics_Java.B5_Operators;

public class B5_Operators {
    public static void main(String[] args) {

        System.out.println("===== 1. Arithmetic Operators =====");
        int a = 15, b = 4;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();

        System.out.println("===== 2. Unary Operators =====");
        int x = 10;
        System.out.println("++x = " + (++x));  
        System.out.println("x++ = " + (x++));  
        System.out.println("Value after x++ = " + x);
        System.out.println("--x = " + (--x));  
        System.out.println("-x = " + (-x));    
        System.out.println("+x = " + (+x));
        System.out.println();

        System.out.println("===== 3. Relational Operators =====");
        int r1 = 20, r2 = 15;
        System.out.println("r1 == r2 : " + (r1 == r2));
        System.out.println("r1 != r2 : " + (r1 != r2));
        System.out.println("r1 > r2  : " + (r1 > r2));
        System.out.println("r1 < r2  : " + (r1 < r2));
        System.out.println("r1 >= r2 : " + (r1 >= r2));
        System.out.println("r1 <= r2 : " + (r1 <= r2));
        System.out.println();

        System.out.println("===== 4. Logical Operators =====");
        boolean L1 = true, L2 = false;
        System.out.println("L1 && L2 = " + (L1 && L2));
        System.out.println("L1 || L2 = " + (L1 || L2));
        System.out.println("!L1 = " + (!L1));
        System.out.println();

        System.out.println("===== 5. Bitwise Operators =====");
        int bw1 = 5;   // 0101
        int bw2 = 3;   // 0011
        System.out.println("bw1 & bw2  = " + (bw1 & bw2));  
        System.out.println("bw1 | bw2  = " + (bw1 | bw2));  
        System.out.println("bw1 ^ bw2  = " + (bw1 ^ bw2));  
        System.out.println("~bw1       = " + (~bw1));       
        System.out.println("bw1 << 2   = " + (bw1 << 2));   
        System.out.println("bw1 >> 1   = " + (bw1 >> 1));   
        System.out.println("bw1 >>> 1  = " + (bw1 >>> 1));  
        System.out.println();

        System.out.println("===== 6. Assignment Operators =====");
        int as = 20;
        as += 5;  System.out.println("+= : " + as);
        as -= 3;  System.out.println("-= : " + as);
        as *= 2;  System.out.println("*= : " + as);
        as /= 4;  System.out.println("/= : " + as);
        as %= 3;  System.out.println("%= : " + as);
        System.out.println();

        System.out.println("===== 7. Ternary Operator =====");
        int t = 18;
        String result = (t >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary result : " + result);
        System.out.println();

        System.out.println("===== 8. Precedence Demo =====");
        int prec = 10 + 5 * 3 - 2; // * evaluated first → 10 + 15 - 2
        System.out.println("10 + 5 * 3 - 2 = " + prec);

        int prec2 = (10 + 5) * (3 - 2); // () evaluated first
        System.out.println("(10 + 5) * (3 - 2) = " + prec2);
    }
}
// ===== 1. Arithmetic Operators =====
// a + b = 19
// a - b = 11
// a * b = 60
// a / b = 3
// a % b = 3

// ===== 2. Unary Operators =====
// ++x = 11
// x++ = 11
// Value after x++ = 12
// --x = 11
// -x = -11
// +x = 11

// ===== 3. Relational Operators =====
// r1 == r2 : false
// r1 != r2 : true
// r1 > r2  : true
// r1 < r2  : false
// r1 >= r2 : true
// r1 <= r2 : false

// ===== 4. Logical Operators =====
// L1 && L2 = false
// L1 || L2 = true
// !L1 = false

// ===== 5. Bitwise Operators =====
// bw1 & bw2  = 1
// bw1 | bw2  = 7
// bw1 ^ bw2  = 6
// ~bw1       = -6
// bw1 << 2   = 20
// bw1 >> 1   = 2
// bw1 >>> 1  = 2

// ===== 6. Assignment Operators =====
// += : 25
// -= : 22
// *= : 44
// /= : 11
// %= : 2

// ===== 7. Ternary Operator =====
// Ternary result : Adult

// ===== 8. Precedence Demo =====
// 10 + 5 * 3 - 2 = 23
// (10 + 5) * (3 - 2) = 15