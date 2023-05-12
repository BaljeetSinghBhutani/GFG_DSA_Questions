package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class Yet_another_query {
    public static ArrayList<Integer> solveQueries(int N, int num, int[] A, int[][] Q) {

        ArrayList<Integer> list  =  new ArrayList<>();

        for(int i = 0; i<Q.length; i++)
        {
            int arr[] = Q[i];


            int i1 = arr[0];
            int j1 = arr[1];
            int k1 = arr[2];

            int count  = 0;
            while(i1<=j1){

                int i2 = i1;
                HashMap<Integer, Integer> map =  new HashMap<>();
                while(i2<N) {

                    map.put(A[i2], map.getOrDefault(A[i2], 0) + 1);
                    i2++;
                }
                if(map.get(A[i1])==k1)
                {
                    count++;
                }
//                map.remove(arr[i1]);
                i1++;
            }
            list.add(count);
        }

        return list;

    }
    public static void main(String[] args) {

        ArrayList<Integer> list  = new ArrayList<>();
      list =   solveQueries(5, 3, new int[]{1, 1, 3, 4, 3}, new int[][] {{0, 2, 2},
                {0, 2, 1},
                {0, 4,2}
        });


        System.out.println(list);
    }
}
