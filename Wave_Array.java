package GFG_DSA_Questions;

import java.util.Arrays;

public class Wave_Array {
    public static void convertToWave(int n, int[] a) {
    for(int i=0; i<n-1; i=i+2)
    {
        int temp = a[i];
        a[i] = a[i+1];
        a[i+1] =  temp;
    }


    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
     convertToWave(arr.length, arr);
        System.out.println(Arrays.toString(arr));
    }
}
