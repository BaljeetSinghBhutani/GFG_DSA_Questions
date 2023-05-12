package GFG_DSA_Questions;

import java.util.Arrays;

public class findSwapValues {

    public static long findSwapValues(long A[], int n, long  B[], int m)
    {

      int sum1 = 0;
      int sum2 = 0;
      for(int i=0; i<n; i++)
          sum1+=A[i];
      for(int i=0; i<m; i++)
          sum2+=B[i];

      for(int i=0; i<m ; i++)
         B[i]*=2;

Arrays.sort(B);
        int need1 = sum1-sum2;
        if(sum1-sum2<0){
            need1 = need1 * -1;
        }
for(int i =0; i<n ; i++)
{
    int need = (int) (need1 + 2*A[i]);
    if(binary_search(B,  0, m-1, need)){
        return 1;
    }

}

return -1;

    }

    private static boolean binary_search(long arr[], int startIndex, int EndIndex, int need) {
        boolean b = false;

        while (startIndex <= EndIndex) {
            int mid = (startIndex + EndIndex) / 2;

            if (need == arr[mid]) {
                b = true;
                return b;
            }
            if (need>arr[mid])
            {
                startIndex = mid +1;

            }
            else{
                EndIndex = mid - 1;
            }

        }
        return b;
    }

    public static void main(String[] args) {
long A[] = {4, 1, 2, 1, 1, 2 };
long B[] = {3, 6, 3, 3};
long a = findSwapValues(A,A.length, B, B.length);
        System.out.println(a);
    }
}
