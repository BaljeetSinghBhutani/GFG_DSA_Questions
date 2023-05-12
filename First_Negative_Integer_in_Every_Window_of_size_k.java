package GFG_DSA_Questions;

import java.util.*;
import java.util.zip.Deflater;

public class First_Negative_Integer_in_Every_Window_of_size_k {
    public static long[] printFirstNegativeInteger(long[] a, int n, int k) {
//         Method -1

      ArrayList<Long>  list = new ArrayList<>();
        Deque<Long> deque = new ArrayDeque<>();
        int i =0;
        for ( i =0; i<k; i++)
        {
            if(a[i]<0)
            {
                deque.addLast(a[i]);
            }
        }
        for (; i<n; i++)
        {
            if(!deque.isEmpty())
            {
                list.add(deque.peek());
            }
            else{
                list.add(0L);
            }
            while (!deque.isEmpty() && deque.peek()==a[i-k])
            {
                deque.remove();
            }
            if(a[i]<0)
            {
                deque.addLast(a[i]);
            }
        }
        if(!deque.isEmpty())
        {
            list.add(deque.peek());
        }
        else{
            list.add(0L);
        }
     long arr[] = new long[list.size()];
        for(int i1 =0; i1<arr.length; i1++)
        {
       arr[i1] = list.get(i1);
        }
        return arr;
    }

    public static void main(String[] args) {
long arr[] = {12, -1, -7, 8, -15, 30, 16, 28};

long ans[] = printFirstNegativeInteger(arr, arr.length, 3);
        System.out.println(Arrays.toString(ans));
    }
}
