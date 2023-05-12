package GFG_DSA_Questions;

public class Count_Of_Subarrays {

    long countSubarray(int arr[], int n, int k) {


        // Method -2
        long unrequired = 0;
        long ans = ((long) n * (long) (n + 1)) / 2l;
        int i = 0;
        while (i < n) {

            if (arr[i] > k) {
                i++;

            } else {
                long count = 0l;
                while (i < n && arr[i] <= k) {
                    i++;
                    count++;
                }

                unrequired += ((long) count * (long) (count + 1)) / 2;

            }
        }


        return ans;


    }
        public static void main(String[] args) {

    }
}
