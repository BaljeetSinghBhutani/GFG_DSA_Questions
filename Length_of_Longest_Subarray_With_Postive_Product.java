package GFG_DSA_Questions;

public class Length_of_Longest_Subarray_With_Postive_Product {
    int maxLength(int arr[], int n) {

        int k = 0;
        int maxmulLen = 0;
        int mul  =1;
        for(int i= 0; i<arr.length; i++)
        {
            mul *=arr[i];
            if(mul==0){
                k++;
        }
            else if(mul>0){
                int length = i-k +1;
                if(length>maxmulLen){
                    maxmulLen = length;
                }
            }

        }
        return maxmulLen;


    }
    public static void main(String[] args) {

    }
}
