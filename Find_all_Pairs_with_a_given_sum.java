package GFG_DSA_Questions;

import java.util.HashMap;

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}
    public class Find_all_Pairs_with_a_given_sum {
    public static  void allPairs( long A[], long B[], long N, long M, long X) {
        HashMap<Long, Integer>  map = new HashMap<>();

        for(int i=0; i<A.length; i++)
        {
           map.put(A[i], 1);
        }

        for(int i=0; i<B.length; i++)
        {
            long a  = X - B[i];

            if(map.containsKey(a))
            {
                if(i<A.length)
                System.out.println(A[i] + " ," +  B[i]);
            }
        }

    }
    public static void main(String[] args) {
long arr[] = {1, 2, 4, 5, 7};
long arr2[] = {5, 6, 3, 4, 8};
long x = 9;

allPairs(arr, arr2, arr.length, arr2.length, x);
    }
}
