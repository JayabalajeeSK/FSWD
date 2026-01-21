package Array;

import java.util.HashMap;

public class LC0001_Scaler_2Sum 
{
    public static void main(String[] args) 
    {
        //int n = 5;
        int arr[] = {7, 6, 3, 8, 2};
        int target = 14;
        int result[]= twoSum(arr,target);
        System.out.println(result[0]+" "+result[1]);

    }
    public static int[] twoSum(int arr[], int target)
    {
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++)
        {
            int secondNumber = target - arr[i];

            if (map.containsKey(secondNumber))
            {
                ans[0] = map.get(secondNumber);
                ans[1] = i;
                return ans;   // return immediately when found
            }

            map.put(arr[i], i);
        }

        return ans; // if no pair found (default 0,0)
    }
    // public static void twoSum(int arr[], int target)
    // {
    //     int ans[] = new int[2];
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for(int i = 0; i<arr.length; i++)
    //     {
    //         int secondNumber = target - arr[i];
    //         {
    //             if(map.containsKey(secondNumber))
    //             {
    //                 ans[0]=map.get(secondNumber);;
    //                 ans[1]=i;
    //                 break;
    //             }
    //             map.put(arr[i], i);
    //         }
    //     }
    //     System.out.println(ans[0]+" "+ans[1]);
        
    // }
}



// 1 3