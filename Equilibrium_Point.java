package GFG_DSA_Questions;

public class Equilibrium_Point {
    public static int equilibriumPoint(long arr[], int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            if (arr[0] == arr[1]) {
                return 1;
            } else {
                return -1;
            }
        }

        int i = 0;
        int j = 1;
        int k = 2;
        int i1 = i;
        int i2 = k;

        int sum1 = 0;
        int sum2 = 0;
        while (k < n) {
            sum1 = 0;
            sum2 = 0;
            while (i >= 0) {
                sum1 += arr[i];
                i--;

            }
            while (k < n) {
                sum2 += arr[k];
                k++;

            }
            if (sum1 == sum2) {
                return j + 1;

            }
            else {
                i1++;
                j++;
                i2++;

                i = i1;
                k = i2;
            }
        }
        if (j == arr.length - 1 && sum1 != sum2) {
            return -1;
        }
        else {
            return j + 1;
        }
    }
    public static void main(String[] args) {

long arr[] = {-7, 1, 5, 2, -4, 3, 0};
        int  a = equilibriumPoint(arr, arr.length);
        System.out.println(a);
    }

}
