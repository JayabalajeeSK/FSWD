package String;

public class LC1209_Remove_All_Adjacent_Duplicates_In_String_2 
{

    public String removeDuplicates(String s, int k) 
    {
        int i = 0;
        StringBuilder newString = new StringBuilder(s);
        int[] count = new int[newString.length()];

        while (i < newString.length()) 
        {
            if (i == 0 || newString.charAt(i) != newString.charAt(i - 1)) 
            {
                count[i] = 1;
            } 
            else 
            {
                count[i] = count[i - 1] + 1;

                if (count[i] == k) 
                {
                    newString.delete(i - k + 1, i + 1);
                    i = i - k;
                }
            }
            i++;
        }
        return newString.toString();
    }

    // MAIN METHOD
    public static void main(String[] args) {
        LC1209_Remove_All_Adjacent_Duplicates_In_String_2 sol = new LC1209_Remove_All_Adjacent_Duplicates_In_String_2();

        // Test case 1
        String s1 = "abcd";
        int k1 = 2;
        System.out.println(sol.removeDuplicates(s1, k1)); // abcd

        // Test case 2
        String s2 = "deeedbbcccbdaa";
        int k2 = 3;
        System.out.println(sol.removeDuplicates(s2, k2)); // aa

        // Test case 3
        String s3 = "pbbcggttciiippooaais";
        int k3 = 2;
        System.out.println(sol.removeDuplicates(s3, k3)); // ps
    }
}
