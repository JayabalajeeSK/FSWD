package Interview.Pattern.Star.Rhombus;

public class InvertedHollowRhombus 
{
    public static void main(String[] args) 
    {
        int n = 4;
        for(int i=n-1; i>=0; i--)
        {
            for(int s = 1; s<=i; s++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<n; j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }   
        
    }
    
}
//    ****
//   *  *
//  *  *
// ****