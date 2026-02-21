package Pattern.Numbers.Box;

public class RowIncreaseBox {
    public static void main(String[] args) {
        int n = 4;
        int start = 1;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(start);
                
            }
            start++;
            System.out.println();
        }
    }  
}
// 1111
// 2222
// 3333
// 4444