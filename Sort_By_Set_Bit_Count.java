package GFG_DSA_Questions;

import java.util.Arrays;

public class Sort_By_Set_Bit_Count {
   public static void sortBySetBitCount(Integer arr[], int n)
    {
// Method -1
        Arrays.sort(arr, (a, b) -> (Integer.bitCount(b) - Integer.bitCount(a)));

    }
    public static void main(String[] args) {

    }
}
