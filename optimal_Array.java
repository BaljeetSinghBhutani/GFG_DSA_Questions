package GFG_DSA_Questions;

public class optimal_Array {
    static  int count;
    public long[] optimalArray(int n,int a[])
    {

         long arr[] = new long[n];
         int k = 0;
         count = 0;
         for(int i =0; i<n; i++)
         {
             count++;
             int med  = findMedian(a, i);
             int op =  findOperations(a, i, med);
             arr[k] =  op;
             k++;
         }

return arr;
    }

    private int  findOperations(int[] a, int index, int median) {
        int ans  = 0;
        for(int i =0; i<=index; i++)
        {
            ans +=Math.abs(median-a[i]);
        }
        return ans;
    }

    private int findMedian(int[] a, int index) {
        int midindex = (0 + index)/2;
        if(count%2==0)
        {
            return (a[midindex] + a[midindex+1])/2;

        }
            return a[midindex];

    }

    public static void main(String[] args) {

    }
}
