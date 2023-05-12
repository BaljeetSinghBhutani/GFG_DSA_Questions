package GFG_DSA_Questions;

import java.util.Arrays;

public class Bitonic_Point {
    int findMaximum(int[] arr, int n) {

        Arrays.sort(arr);
        return arr[n-1];
    }
    public static void main(String[] args) {

    }
}
