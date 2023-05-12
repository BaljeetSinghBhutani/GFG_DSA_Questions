package GFG_DSA_Questions;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;


public class Distinct_Numbers {
    public static ArrayList<Integer> getDistinctDifference(int N, int[] A) {

        //Method -2


        HashMap<Integer,Integer> left = new HashMap<>();
        HashMap<Integer,Integer> right = new HashMap<>();
        ArrayList<Integer> list =  new ArrayList<>();


        for(int i =0; i<N; i++)
        {
            if(right.containsKey(A[i]))
            {
                right.put(A[i], right.get(A[i])+1);
            }
            else{
                right.put(A[i], 1);
            }
        }

        for(int i=0; i<N; i++)
        {

   if(right.containsKey(A[i]))
   {
       if(right.get(A[i])==1)
       {
           right.remove(A[i]);
       }
       else{
           right.put(A[i], right.get(A[i])-1);
       }
   }
            list.add(left.size()- right.size());


            left.put(A[i] , left.getOrDefault(0, A[i])+1);

        }

return list;
    }

    public static void main(String[] args) {

        int arr[] =  {4, 3, 3};

  ArrayList<Integer>  list = getDistinctDifference(arr.length, arr);
        System.out.println(list);
    }
}
