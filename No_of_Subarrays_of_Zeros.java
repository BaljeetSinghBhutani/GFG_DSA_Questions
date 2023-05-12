package GFG_DSA_Questions;

public class No_of_Subarrays_of_Zeros {
    long no_of_subarrays(int N, int [] arr) {
        long ans= 0;

        int i = 0;
        int count0 =0;
        while (i<N)
        {

            if(arr[i]==0)
            {
                count0++;
            }
            else{
                ans+=(count0 *  count0 +1)/2;
                count0 =0;
            }
            i++;
        }




        return ans;

    }
    public static void main(String[] args) {

    }
}
