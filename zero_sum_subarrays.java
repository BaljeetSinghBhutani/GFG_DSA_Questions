package GFG_DSA_Questions;

import java.util.HashMap;

public class zero_sum_subarrays {
    public static long findSubarray(long[] arr ,int n)
    {
        HashMap<Long, Integer> map = new HashMap<>();
            long sum = 0;
            int frequency  = 1;
            map.put(sum, frequency);
            int count  =0;

            for(int i =0; i<arr.length; i++)
            {
                sum+=arr[i];
                if(map.containsKey(sum))
                {
                    count +=  map.get(sum);
                    map.put(sum, map.get(sum)+1);

                }
                else{
                    map.put(sum, 1);
                }
            }
            return count;
    }

}
