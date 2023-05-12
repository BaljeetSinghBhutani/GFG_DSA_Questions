package GFG_DSA_Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Missing_Number_in_Array {

    public  static  int MissingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);

        for(int i =0; i<array.length; i++){
            if(array[i] != i+1){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
int arr[] = { 1,2,3,5};
        System.out.println(MissingNumber(arr, 4));

    }
}
