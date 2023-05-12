package GFG_DSA_Questions;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_Element {
    public static long[] nextLargerElement(long[] arr, int n)
    {
//         Method -2

        long ans[] = new long[n];
     Stack<Long> stack = new Stack<>();

     for(long i = n-1; i>=0; i--) {
         if (!stack.isEmpty()) {
             long a = stack.peek();
             if (arr[(int) i] < a) {
                 ans[(int) i] = a;
                 stack.push(arr[(int) i]);
             } else {
                 long b =  arr[(int) i];
                 while (!stack.isEmpty() && b >= stack.peek() ) {
                     stack.pop();
                 }
                 if (!stack.isEmpty()) {
                     ans[(int) i] = stack.peek();
                 } else {
                     ans[(int) i] = -1;
                 }
                 stack.push(b);

             }
         }
     else
             {
                 ans[(int) i] = -1;
                 stack.push(arr[(int) i]);
             }


         }
        return ans;
     }








//         Method -1

//        long ans[] = new long [arr.length];
//        int k = 0;
//        for(long i =0; i<n; i++){
//            int l =k;
//            for(long j = i+1; j<n; j++){
//                if(arr[(int) j]>arr[(int) i]){
//                    ans[k] = arr[(int) j];
//                    k++;
//                    break;
//                }
//
//            }
//            if(k!=l+1){
//                ans[k] = -1;
//                k++;
//            }
//        }
//
//
//
//        return ans;
//

    public static void main(String[] args) {
long arr[]  = {6, 8, 0, 1, 3};

arr =nextLargerElement(arr, arr.length);
        for(int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
