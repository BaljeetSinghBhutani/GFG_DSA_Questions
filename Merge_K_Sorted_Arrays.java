package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
     int li;
     int di;
     int val;

     Pair(int li, int di, int val)
     {
         this.li = li;
         this.di =  di;
         this.val = val;
     }


    @Override
    public int compareTo(Pair o) {
        return this.val-o.val;
    }
}
public class Merge_K_Sorted_Arrays {

    public static ArrayList<Integer> mergeKArrays(int[][] arr, int K)
    {
        ArrayList<Integer>list = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i =0; i<arr.length; i++)
        {
            pq.add(new Pair(i, 0, arr[i][0]));
        }

while(!pq.isEmpty())
{
    Pair p = pq.remove();
    list.add(p.val);
    p.di++;

    if(p.di<arr[p.li].length){

    p.val = arr[p.li][p.di];
    pq.add(p);

    }

}
return list;

    }
    public static void main(String[] args) {

    }
}
