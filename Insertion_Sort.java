package GFG_DSA_Questions;

import java.util.Arrays;

public class Insertion_Sort {
    public  static  void insertionSort(int arr[], int n)
    {
for(int i = 1; i<n; i++)
{
    for(int j =i; j>0; j-- )
    {
        if(arr[j]<arr[j-1])
        {
int temp = arr[j];
arr[j] = arr[j-1];
arr[j-1] = temp;

        }
    }
}
    }
    public static void main(String[] args) {
int arr[] = {24, 18, 38, 43, 14, 40, 1, 54};
insertionSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
