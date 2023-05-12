package GFG_DSA_Questions;

import java.util.HashMap;

public class Count_Pair_with_given_sum {
   public static int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
       for (int i = 0; i < arr.length; i++) {
       int a = k - arr[i];
       if (map.containsKey(a)) {
           int b = map.get(a);
           while (b > 0) {
               count++;
               b--;
           }
       }

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }


        }
        return count;
    }
    public static void main(String[] args) {
int arr[] ={1, 5, 7, 1};
        System.out.println(getPairsCount(arr, 4, 6));
    }
}
