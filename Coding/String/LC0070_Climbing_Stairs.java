package String;

public class LC0070_Climbing_Stairs {

    public static int climbStairs(int n) 
    {
        if (n <= 2) return n;

        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) 
        {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        // Test case 1
        int n1 = 2;
        System.out.println(climbStairs(n1)); // 2

        // Test case 2
        int n2 = 3;
        System.out.println(climbStairs(n2)); // 3

        // Test case 3
        int n3 = 5;
        System.out.println(climbStairs(n3)); // 8
    }
}
