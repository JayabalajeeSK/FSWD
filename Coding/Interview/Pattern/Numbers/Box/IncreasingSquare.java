package Pattern.Numbers.Box;

public class IncreasingSquare {
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
            System.out.println();
        }
    }  
}
// 1234
// 5678
// 9101112
// 13141516

