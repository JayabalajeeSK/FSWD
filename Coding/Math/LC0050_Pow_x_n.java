package Math;

public class LC0050_Pow_x_n 
{
    public static double myPow(double x, int n) 
    {
        double pow = Math.pow(x,n);
        return pow;
    }

    public static void main(String[] args) 
    {
        System.out.println(myPow(2.00000, -2));
        
    }
}
// 0.25

// class Solution {
//     public double myPow(double x, int n) {
//         double ans = 1.0;
//         long N = n;
//         if (n < 0) N = -N; // Convert n to positive to avoid overflow issues

//         while (N > 0) {
//             if (N % 2 == 1) { // If N is odd
//                 ans *= x;  
//             }
//             x *= x;  // Square x
//             N /= 2;  // Halve N
//         }

//         return (n < 0) ? 1.0 / ans : ans; // If original n was negative, take reciprocal
//     }
// }