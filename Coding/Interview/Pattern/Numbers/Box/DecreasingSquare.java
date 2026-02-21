package Pattern.Numbers.Box;

public class DecreasingSquare {
    public static void main(String[] args) {
        int n = 5;
        int start = n*n;
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                System.out.print(start);
                start--;
            }
            System.out.println();
        }
    }  
}
// 16151413
// 1211109
// 8765
// 4321
