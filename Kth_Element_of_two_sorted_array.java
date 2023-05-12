package GFG_DSA_Questions;

public class Kth_Element_of_two_sorted_array {
    public long kthElement( long arr1[], long arr2[], int n, int m, int k) {

//        Method -2

        if (n > m) {
            return kthElement(arr2, arr1, m, n, k);
        }

        long low = Math.max(0, k - m);
        long high = Math.min(k, n);

        while (low <= high) {
            long cut1 = (low + high) >> 1;
            long cut2 = k - cut1;

            long l1 = cut1 == 0 ? Long.MIN_VALUE : arr1[(int) (cut1 - 1)];
            long l2 = cut2 == 0 ? Long.MAX_VALUE : arr2[(int) (cut2 - 1)];
            long r1 = cut1 == arr1.length ? Long.MAX_VALUE : arr1[(int) cut1];
            long r2 = cut2 == arr2.length ? Long.MAX_VALUE : arr2[(int) cut2];

            if ((l1 <= r2) && (l2<=r1)) {

                return Math.max(l1, l2);

            } else if (l1>r2) {
                high = cut1-1;
            }
            else{
                low = cut1+1;
            }

        }
        return 1;


    }








//Method -1

//        long ans[] = new long[n+m];
//int k1 =0;
//        int i =0;
//        int j =0;
//        while(i<n && j<m)
//        {
//            if(arr1[i]<arr2[j])
//            {
//                ans[k1] = arr1[i];
//                i++;
//                k1++;
//            }
//            else {
//                ans[k1] = arr2[j];
//                k1++;
//                j++;
//            }
//        }
//
//        while(i<n)
//        {
//            ans[k1] = arr1[i];
//            k1++;
//        }
//
//        while(j<n)
//        {
//            ans[k1] = arr2[j];
//            k1++;
//        }
//    return ans[k-1];

//    }
    public static void main(String[] args) {

    }
}
