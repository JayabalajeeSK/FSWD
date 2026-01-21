package Matrix;

public class Maximum_Num_of_1s_row 
{
    public static int[] rowAndMaximumOnes(int[][] mat)  
    {
        int minIndex = 0;
        int lastMaxOnes = 0;

        for (int i = 0; i < mat.length; i++) 
        {
            int maxOnes = 0;
            for (int j = 0; j < mat[i].length; j++) maxOnes = maxOnes + mat[i][j];

            if (lastMaxOnes < maxOnes) 
            {
                lastMaxOnes = maxOnes;
                minIndex = i;
            }
        }
        return new int[]{minIndex, lastMaxOnes};
    }

    // Main method
    public static void main(String[] args) 
    {
        int[][] mat = {
            {0, 1, 1},
            {1, 1, 1},
            {0, 0, 1}
        };

        int[] result = rowAndMaximumOnes(mat);

        System.out.println("Row index with maximum 1s: " + result[0]);
        System.out.println("Maximum number of 1s: " + result[1]);
    }
}
// Row index with maximum 1s: 1
// Maximum number of 1s: 3