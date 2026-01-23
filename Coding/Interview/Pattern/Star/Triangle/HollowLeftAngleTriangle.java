package Interview.Pattern.Star.Triangle;

public class HollowLeftAngleTriangle 
{
    public static void main(String[] args) 
    {
        int n = 6;
        for(int i = 0; i < n; i++)
        {
            for(int s=0; s<n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++)
            {
                if(i==n-1 || j==0 || i == j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
//       *
//      **
//     * *
//    *  *
//   *   *
//  ******