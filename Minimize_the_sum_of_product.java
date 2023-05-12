package GFG_DSA_Questions;

import java.util.Arrays;

public class Minimize_the_sum_of_product {

    public long minValue(long a[], long b[], long n) {
        long sum = 0;
        long m = 0;
        Arrays.sort(a);
        Arrays.sort(b);


        for (long i = n - 1; i >= 0; i--) {
            sum += a[(int) i] * b[(int) m];
            m++;
        }
        return sum;
    }
    public static void main(String[] args) {

        long a[] = {6, 1, 9, 5, 4};
        long b[] = {3, 4, 8, 2, 4};

    }

}