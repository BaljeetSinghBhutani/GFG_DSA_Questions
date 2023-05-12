package GFG_DSA_Questions;

import java.util.Arrays;

public class Swapping_Pairs_Makes_Sum_Equal {

    static long getSum(long X[], int n ){
        long sum  =0;

        for(int i =0; i<n;i++){
            sum+= X[i];
        }
        return sum;
    }

    static long getTarget(long A[], int n , long B[], int m){

        long sum1 = getSum(A, n);
        long sum2 =  getSum(B, m);


        if((sum1 - sum2) %2 !=0 ){
            return 0;
        }
        return (sum1  - sum2) /2;
    }

    public static long findSwapValues(long A[], int n, long  B[], int m)
    {
       if(Arrays.equals(A, B))
       {
           return 1;
       }
        Arrays.sort(A);
        Arrays.sort(B);

        long target = getTarget(A, n, B,m );

        if(target==0){
            return -1;
        }

        int i =0;
        int j = 0;

        while(i<n && j<m){
            long diff  = A[i] - B[j];

            if(diff == target){
                return 1;
            }

            else if(diff<target){
                i++;
            }

            else{
                j++;
            }


        }
return -1;
    }

//     Method -1
//        long sumA = 0;
//        for(int i=0; i<A.length; i++)
//        {
//            sumA+=A[i];
//        }
//
//
//        long sumB = 0;
//        for(int i=0; i<B.length; i++)
//        {
//            sumB+=B[i];
//        }
//for(int i =0; i<B.length;i++)
//{
//    B[i] = 2 * B[i];
//}
//
//Arrays.sort(B);
//
//for(int i =0; i<A.length; i++)
//{
//   boolean b=  binarysearchinB( B, Math.abs(sumB - sumA) + 2 *A[i]);
//    if(b)
//    {
//        return 1;
//    }
//}
//return -1;
//    }
//
//    private static boolean binarysearchinB(long[] B, long l) {
//       long startIndex = 0;
//       long EndIndex  = B.length-1;
//
//       while(startIndex<=EndIndex)
//       {
//           long mid  = (startIndex + EndIndex)/2;
//           if(B[(int) mid]==l)
//           {
//
//               return true;
//           }
//
//           else if(B[(int) mid]>l)
//           {
//               EndIndex = mid -1;
//           }
//           else {
//               startIndex = mid +1;
//           }
//       }
//       return false;
//    }


    public static void main(String[] args) {
long A[] = {4, 1, 2, 1, 1, 2};
long B[] = {3, 6, 3, 3};

long a = findSwapValues(A, A.length, B, B.length);
        System.out.println(a);
    }
}
