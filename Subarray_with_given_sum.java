package GFG_DSA_Questions;

import java.util.ArrayList;

public class Subarray_with_given_sum {

    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> list = new ArrayList<>(2);

        for(int i =0; i<arr.length; i++)
        {
            int sum =0;
            for(int j =i; j<arr.length; j++){
                sum+=arr[j];
                if(sum == s){
                    list.add(i+1);
                    list.add(j+1);

return list;

                }
            }
        }
        list.add(-1);
        return list;
    }


    public static void main(String[] args) {
int arr[]  = {1,2,3,7,5};
ArrayList<Integer>  list = subarraySum(arr, 5, 12);
for(int i =0; i<list.size(); i++)
{
    System.out.println(list.get(i));
}

    }
}
