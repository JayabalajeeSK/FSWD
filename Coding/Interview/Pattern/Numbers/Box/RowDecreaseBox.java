package Pattern.Numbers.Box;

public class RowDecreaseBox {
    public static void main(String[] args) {
        int n = 4;
        int start = 4;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(start);
                
            }
            start--;
            System.out.println();
        }
    }  
}
// 4444
// 3333
// 2222
// 1111