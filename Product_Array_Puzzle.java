package GFG_DSA_Questions;

import java.util.Arrays;

public class Product_Array_Puzzle {
    public static long[] productExceptSelf(int nums[], int n) {
        long arr[] = new long[n];
        int k = 0;

        for (int i = 0; i<n; i++){
arr[k] =1;
            for(int j =0; j<n; j++)
            {
                if(nums[j]!=nums[i])
                {
                    arr[k] = (long) ((arr[k]*nums[j]) % (Math.pow(10, 9) +7));
                }
            }

            k++;

        }

            return arr;
    }
    public static void main(String[] args) {
int nums[] = {10, 3, 5, 6, 2};
long arr[] = productExceptSelf(nums, nums.length);
        System.out.println(Arrays.toString(arr));
    }
}
