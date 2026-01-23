package Interview.Pattern.Star.Butterfly;

public class Butterfly
{
    public static void main(String[] args) 
    {
        int n = 6;

        // upper part
        for (int i = 0; i < n; i++)
        {
            // left stars
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }

            // middle spaces
            for (int s = 0; s < 2 * (n - i - 1); s++)
            {
                System.out.print(" ");
            }

            // right stars
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower part
        for (int i = n - 2; i >= 0; i--)
        {
            // left stars
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }

            // middle spaces
            for (int s = 0; s < 2 * (n - i - 1); s++)
            {
                System.out.print(" ");
            }

            // right stars
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
// *          *
// **        **
// ***      ***
// ****    ****
// *****  *****
// ************
// *****  *****
// ****    ****
// ***      ***
// **        **
// *          *