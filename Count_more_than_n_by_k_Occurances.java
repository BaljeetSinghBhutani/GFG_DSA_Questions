package GFG_DSA_Questions;


import java.util.HashMap;

public class Count_more_than_n_by_k_Occurances {
    public int countOccurence(int[] arr, int n, int k)
    {
   int count  = n/k;
   int final_count  = 0;
        HashMap<Integer, Integer>  map = new HashMap<>();
        for(int i =0; i< arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) +1);
                if(map.get(arr[i])==count+1)
                {
                    final_count++;
                }
            }
            else {
                map.put(arr[i],1);
            }
        }
return final_count;
    }
    public static void main(String[] args) {

    }
}
