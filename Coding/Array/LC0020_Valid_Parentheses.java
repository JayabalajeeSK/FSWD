package Array;

import java.util.Stack;

public class LC0020_Valid_Parentheses {
    public static boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) 
        {
            if (c == '(') stack.push(')');

            else if (c == '{') stack.push('}');

            else if (c == '[') stack.push(']');

            else if (stack.isEmpty() || stack.pop() != c) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        

        // Example 1
        String s1 = "()";
        System.out.println("Input: " + s1 + " -> Output: " + isValid(s1));

        // Example 2
        String s2 = "()[]{}";
        System.out.println("Input: " + s2 + " -> Output: " + isValid(s2));

        // Example 3
        String s3 = "(]";
        System.out.println("Input: " + s3 + " -> Output: " + isValid(s3));

        // Example 4
        String s4 = "([])";
        System.out.println("Input: " + s4 + " -> Output: " + isValid(s4));

        // Example 5
        String s5 = "([)]";
        System.out.println("Input: " + s5 + " -> Output: " + isValid(s5));
    }
}
// Input: () -> Output: true
// Input: ()[]{} -> Output: true
// Input: (] -> Output: false
// Input: ([]) -> Output: true
// Input: ([)] -> Output: false