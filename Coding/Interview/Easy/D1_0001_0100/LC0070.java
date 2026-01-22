package Interview.Easy.D1_0001_0100;


class Solution {
    // climbStairs(int n) 
    public int climbStairs(int n) 
    {
        if (n <= 2) return n;  // simplified condition

        int a = 1, b = 2, c = 0;

        for (int i = 3; i <= n; i++) 
        {
            c = a + b;
            a = b;
            b = c;
        }

        return c; //b // final number of ways
    }

    // main method
    public static void main(String[] args) {
        Solution obj = new Solution();

        int n1 = 1;
        int n2 = 2;
        int n3 = 5;

        System.out.println("Ways to climb " + n1 + " stairs: " + obj.climbStairs(n1));
        System.out.println("Ways to climb " + n2 + " stairs: " + obj.climbStairs(n2));
        System.out.println("Ways to climb " + n3 + " stairs: " + obj.climbStairs(n3));
    }
}
