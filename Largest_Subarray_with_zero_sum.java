package GFG_DSA_Questions;

import java.net.Inet4Address;
import java.util.HashMap;

public class Largest_Subarray_with_zero_sum {
   static int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum  = 0;
        int index  =-1;
        map.put(sum, index);
        int length = 0;

        for(int i =0; i<arr.length;i++)
        {
            sum+=arr[i];
if(map.containsKey(sum))
{
    int size  = map.get(sum);
        int len  =  i - size;
    if(len>length)
    {
        length = len;
    }
}
else {

    map.put(sum, i);
}
        }
        return length;
    }

    public static void main(String[] args) {
        int nums[] ={15,-2,2,-8,1,7,10,23};
       int a  = maxLen(nums, nums.length);
        System.out.println(a);
    }

}
