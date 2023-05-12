package GFG_DSA_Questions;

import java.util.Arrays;
import java.util.Stack;

public class Immediate_Smaller_Element {
   public static void immediateSmaller(int arr[], int n) {
        Stack<Integer>  stack = new Stack<>();
        int k =n-2;
        for(int i =0; i<arr.length; i++)
        {
            stack.push(arr[i]);
        }
//arr[n-1] = -1;
        int a  = stack.pop();
        int b  = stack.pop();

        while (!stack.isEmpty() ) {

            if (b > a) {
                arr[k] = a;
            } else {
                arr[k] = -1;
            }
            k--;
            a = b;
            b = stack.pop();
        }
       if (b > a) {
           arr[k] = a;
       } else {
           arr[k] = -1;
       }

arr[n-1] = -1;
        }

    public static void main(String[] args) {
int arr[] = {4,2, 1, 5, 3};
immediateSmaller(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
