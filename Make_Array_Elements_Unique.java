package GFG_DSA_Questions;

import java.util.Arrays;

public class Make_Array_Elements_Unique {
    public static long minIncrements(int[] arr, int N) {

        long count = 0;
        Arrays.sort(arr);
        for (int i =1; i<arr.length; i++)
        {
            if(arr[i]<=arr[i-1])
            {
                int val = arr[i-1]-arr[i] + 1;
                count+=val;
                arr[i]= val;
            }
        }
return count;

//4 5 4 1 3 7 6 3 3
    }
    public static void main(String[] args) {
int arr[] = {1, 1, 2, 3};
long c = minIncrements(arr, arr.length);
        System.out.println(c);
    }
}
