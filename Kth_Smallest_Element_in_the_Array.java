package GFG_DSA_Questions;

public class Kth_Smallest_Element_in_the_Array {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        int a = 0;
        int b = 0;
        int k1 = k;
        int ans[] = new int[k];

        int index = 0;
        while (b < k1) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    index = i;
                }
            }


            arr[index] = Integer.MAX_VALUE;
            ans[a] = min;
            a++;
            k1--;
        }

        return ans[k-1];
    }



    public static void main(String[] args) {
int arr[] = { 7, 10, 4, 3, 20, 15};
int k =3;
int a  = kthSmallest(arr, 0, arr.length, k);
        System.out.println(a);
    }
}
