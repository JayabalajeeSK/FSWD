package Interview.Easy.D1_0001_0100;
import java.util.Stack;



public class LC0020 {
    // Method to check if parentheses are valid
    public boolean isValid(String s) 
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

    // Main method to test
    public static void main(String[] args) {
        LC0020 sol = new LC0020();

        String s1 = "(){}[]";
        System.out.println(s1 + " is valid? " + sol.isValid(s1));

        String s2 = "([{}])";
        System.out.println(s2 + " is valid? " + sol.isValid(s2));

        String s3 = "([)]";
        System.out.println(s3 + " is valid? " + sol.isValid(s3));

        String s4 = "{[()]}";
        System.out.println(s4 + " is valid? " + sol.isValid(s4));

        String s5 = "(((";
        System.out.println(s5 + " is valid? " + sol.isValid(s5));
    }
}
