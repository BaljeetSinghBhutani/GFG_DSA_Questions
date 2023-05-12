package GFG_DSA_Questions;

import java.util.HashMap;

public class Count_Pairs_with_Given_Sum {
    int getPairsCount(int[] arr, int n, int k) {
        // code here

int ans = 0;

        HashMap<Integer, Integer>  map  = new HashMap<>();
      for(int i =0; i<arr.length; i++)
      {
          int a = k - arr[i];
          if(map.containsKey(a))
          {
              int fre =  map.get(a) ;

              while (fre>0)
              {
                  ans++;
                  fre--;
              }
          }


          map.put(arr[i], map.getOrDefault(arr[i], 0)+1);


      }
return ans;

    }
    public static void main(String[] args) {

    }
}
