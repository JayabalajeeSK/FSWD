package Interview.Pattern.Star.Pyramid;


public class HollowDiamond 
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
            for(int j = 0; j<2*i+1; j++) //<= for even
            {
                if(j ==0 || j==2 * i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }


        for(int i = n-2; i >= 0; i--)
        {
            for(int s=0; s<n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j<2*i+1; j++) //<= for even
            {
                if(j ==0 || j==2 * i) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    
}
//       *
//      * *
//     *   *
//    *     *
//   *       *
//  *         *
//   *       *
//    *     *
//     *   *
//      * *
//       *