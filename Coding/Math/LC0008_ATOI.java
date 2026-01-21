package Math;

public class LC0008_ATOI {

    public static int myAtoi(String s) {

        int i = 0;
        int n = s.length();
        int sign = 1;
        int result = 0;

        // 1. Ignore leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Convert digits
        while (i < n) {
            char ch = s.charAt(i);

            // stop if not a digit (ASCII check)
            if (ch < '0' || ch > '9') {
                break;
            }

            int digit = ch - '0';

            // 4. Handle overflow
            if (result > Integer.MAX_VALUE / 10 ||
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    // Main method for testing
    public static void main(String[] args) {


        System.out.println(myAtoi("42"));           // 42
        System.out.println(myAtoi("   -042"));      // -42
        System.out.println(myAtoi("1337c0d3"));     // 1337
        System.out.println(myAtoi("0-1"));          // 0
        System.out.println(myAtoi("words and 987"));// 0
        System.out.println(myAtoi("-91283472332")); // -2147483648
    }
}

