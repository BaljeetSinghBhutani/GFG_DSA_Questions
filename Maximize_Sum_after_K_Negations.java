package GFG_DSA_Questions;

import java.util.Arrays;

public class Maximize_Sum_after_K_Negations {

    public static long maximizeSum(long a[], int n, int k)
    {

      long count  =0;
      long sum = 0;
      for(long i =0; i<a.length && count<k;i++)
      {
          if(a[(int) i]<=0)
          {
              count++;
              a[(int) i] = - a[(int) i];
          }
      }
        Arrays.sort(a);

      if((k-count) %2!=0)
      {
          a[0] = -a[0];
      }
      for(long i = 0;i<a.length; i++)
      {
          sum+=a[(int) i];
      }
return sum;

    }
    public static void main(String[] args) {
long arr[] ={1, 2, -3, 4, 5};
long a  =maximizeSum(arr, arr.length, 5);
        System.out.println(a);

    }
}
