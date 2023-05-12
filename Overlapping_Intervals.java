package GFG_DSA_Questions;

import java.util.Arrays;
import java.util.Stack;

public class Overlapping_Intervals {

    public static class Pair implements Comparable<Pair>{
        int st;
        int et;

        Pair(int st, int et)
        {
            this.st  = st;
            this.et  =  et;
        }


        @Override
        public int compareTo(Pair other) {
            if(this.st!=other.st)
            {
                return this.st- other.st;
            }
            else {
                return  this.et - other.et;
            }
        }
    }
    public int[][] overlappedInterval(int[][] arr)
    {
Pair[]  pairs  =  new Pair [arr.length];
for(int i =0; i<arr.length; i++)
{
    pairs[i] = new Pair(arr[i][0], arr[0][i]);
}
Arrays.sort(pairs);
Stack<Pair> stack = new Stack<>();
stack.push(pairs[0]);
for(int  i = 1; i<arr.length; i++)
{
    Pair seek = stack.peek();
   if(pairs[i].st>seek.et)
   {
       stack.push(pairs[i]);

   } else  {

       seek.et = Math.max(seek.et, pairs[i].et);
   }
}

Stack<Pair> dup = new Stack<>();
while(!stack.isEmpty())
{
    dup.push( stack.pop());

}

int ans[][]  = new int[dup.size()][2];

for(int i  =0; i<ans.length; i++)
{
  Pair seek2 = dup.peek();
  ans[i][0] = seek2.st;
  ans[i][1] = seek2.et;
  dup.pop();

}
return ans;
    }
    public static void main(String[] args) {

    }
}
