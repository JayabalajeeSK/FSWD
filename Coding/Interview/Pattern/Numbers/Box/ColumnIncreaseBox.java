package Pattern.Numbers.Box;

public class ColumnIncreaseBox 
{
    public static void main(String[] args) {
        int n = 4;
        int start = 1;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(start);
                 start++;
            }
            start = 1;
           
            System.out.println();
        }
    }  
}
// 1234
// 1234
// 1234
// 1234