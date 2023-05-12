package GFG_DSA_Questions;

import java.util.Collections;
import java.util.PriorityQueue;

public class Longest_Perfect_Piece {
    static int longestPerfectPiece(int[] arr, int N) {

PriorityQueue<Integer> min = new PriorityQueue<>();
PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
int ans = 0;
for(int i =0; i<arr.length; i++)
{
    min.add(arr[i]);
    max.add(arr[i]);

          int j = 0;
            while(j<N && max.peek()-min.peek()>1)
            {
                max.remove();
                min.remove();
                j++;
            }
ans = Math.max(ans, max.size());
}

return ans;
    }

    public static void main(String[] args) {

    }

}
