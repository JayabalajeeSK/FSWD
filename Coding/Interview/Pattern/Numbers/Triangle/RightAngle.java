package Pattern.Numbers.Triangle;

public class RightAngle
{
    public static void main(String[] args) 
    {
        int n = 4;
        int start = 1;
        for(int i = 0; i<n; i++)
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
// 1
// 23
// 456
// 78910