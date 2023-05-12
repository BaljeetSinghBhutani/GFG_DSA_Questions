package GFG_DSA_Questions;

import java.util.Arrays;

public class Convert_Array_into_ZigZag_Fashiion {
    public static void main(String[] args) {

        int arr[] = {4, 3, 7, 8 ,6, 2, 1};

//        Method - correct but output is Wrong

//        Arrays.sort(arr);
//
//        for (int i = 1; i <arr.length-1 ; i = i+2) {
//
//            int a = arr[i];
//            int b = arr[i+1];
//
//            int temp = a;
//            arr[i] =b;
//            arr[i+1] = temp;
//
//
//        }


//         Method - 2


        for(int i =1; i<arr.length; i=i+2)
        {
            if(arr[i-1]>arr[i])
            {
                int a = arr[i];
            int b = arr[i-1];

            int temp = a;
            arr[i] =b;
            arr[i-1] = temp;
//
            }

            if( i< arr.length && arr[i+1]>arr[i]){
                int a = arr[i];
                int b = arr[i+1];

                int temp = a;
                arr[i] =b;
                arr[i+1] = temp;
//
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
