package Pattern.Numbers.Box;

public class ColumnDecreaseBox 
{
    public static void main(String[] args) {
        int n = 4;
        int start = n;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(start);
                 start--;
            }
            start = n;
           
            System.out.println();
        }
    }  
}
// 4321
// 4321
// 4321
// 4321