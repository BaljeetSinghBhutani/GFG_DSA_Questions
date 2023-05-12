package GFG_DSA_Questions;

import java.util.Arrays;

public class Maximum_Triple_Product {
    Long maxTripletProduct(Long arr[], int n)
    {


        Arrays.sort(arr);
        return Math.max(arr[0] *  arr[1] *  arr[n-1] , arr[n-1] * arr[n-2] *  arr[n-3]);

    }
    public static void main(String[] args) {

    }
}
