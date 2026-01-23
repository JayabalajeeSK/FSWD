package Interview.Pattern.Star.Triangle;

public class InvertedLeftAngleTriangle 
{
    public static void main(String[] args) 
    {
        int n = 6;
        for(int i= n-1; i>=0; i--)
        {
            for(int s=0; s<n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
//  ******
//   *****
//    ****
//     ***
//      **
//       *