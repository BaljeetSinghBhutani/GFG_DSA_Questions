package GFG_DSA_Questions;

import java.util.ArrayList;

public class Subarray_with_given_sum_II {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {

        ArrayList<Integer> list  = new ArrayList<>();

        int sum = 0;
        int j = -1;
        int i = -1;

        while (true)
        {
            boolean flag1 =  false;
            boolean flag2 =  false;
            while(i<arr.length-1)
            {
                flag1 = true;
                i++;
                sum+=arr[i];
                if(sum>s)
                {
                    break;
                } else if (sum==s) {

                        list.add(j+2);
                        list.add(i+1);
                        return list;

                }
            }


            while (j<i)
            {
                flag2 = true;
                j++;
                sum-=arr[j];
                if(sum<s)
                {
                    break;
                } else if (sum==s) {
                    {
                        list.add(j+2);
                        list.add(i+1);
                        return list;
                    }

                }
            }

            if(!flag1 && flag2)
            {
                break;
            }

        }

list.add(-1);
list.add(-1);
        return list;

    }
    public static void main(String[] args) {

    }
}
