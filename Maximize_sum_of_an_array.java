package GFG_DSA_Questions;
import java.util.Arrays;

public class Maximize_sum_of_an_array {
    public static int Maximize(int arr[], int n)
    {
        long count2 =0;
                long count1=0;
        for(int i =0; i<arr.length; i++){
            count1=(((long)arr[i]*i) + count1)%1000000007;
        }
        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++)
        {
            count2=(((long)arr[i]*i) +count2)%1000000007;
        }


        return (int) (Math.max(count1, count2));

    }
    public static void main(String[] args) {

    }
}
