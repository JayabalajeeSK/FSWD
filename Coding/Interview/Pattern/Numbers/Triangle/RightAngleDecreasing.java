package Pattern.Numbers.Triangle;

public class RightAngleDecreasing
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
// 10
// 98
// 
// 78910