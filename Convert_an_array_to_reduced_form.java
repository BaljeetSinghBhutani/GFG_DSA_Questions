package GFG_DSA_Questions;

import java.util.Arrays;
import java.util.HashMap;

public class Convert_an_array_to_reduced_form {
    static  void convert(int[] arr, int n) {

         int a[] = new int[arr.length];
         for(int i =0; i<a.length; i++)
         {
             a[i] = arr[i];
         }
          Arrays.sort(arr);

        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[n];
        for(int i  =0; i<arr.length; i++)
        {
            map.put(arr[i], i);
        }

        for(int i = 0; i<a.length; i++)
        {
            if(map.containsKey(a[i]))
            {
                ans[i] = map.get(a[i]);
            }
        }

       for(int i= 0; i<arr.length; i++)
       {
           arr[i] = ans[i];
       }



    }

    public static void main(String[] args) {
int arr[] =  {10, 40, 20};
convert(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
