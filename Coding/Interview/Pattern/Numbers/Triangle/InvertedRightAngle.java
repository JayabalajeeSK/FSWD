package Pattern.Numbers.Triangle;

public class InvertedRightAngle
{
    public static void main(String[] args) 
    {
        int n = 4;
        int start = 1;
        for(int i =n-1; i>=0; i--)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print(start);
                 start++;
            }
           
            System.out.println();
        }
    }  
}
// 1234
// 567
// 89
// 10