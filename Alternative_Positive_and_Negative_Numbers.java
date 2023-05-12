package GFG_DSA_Questions;

public class Alternative_Positive_and_Negative_Numbers {
    void rearrange(int arr[], int n) {
        int count1  =0;
        int count2  =0;
        int k1  =0;
        int k2= 0;
     for(int i =0;  i<arr.length; i++)
     {
         if(arr[i]>0){
             count1++;
         }
         else{
             count2++;
         }
     }

     int arr1[] =new int[count1];
     int arr2[] =new int[count2];

     for(int i =0; i<arr.length; i++)
     {
         if(arr[i]>=0){
             arr1[k1] = arr[i];
             k1++;
         }
         else {
             arr2[k2] = arr[i];
             k2++;
         }
     }
     int l =0;
     int m =0;
     int i =0;
     while(l<count1 && m<count2 &&i<arr.length){
         arr[i] = arr1[l];
         l++;
         i++;
         arr[i]= arr2[m];
         i++;
         m++;
     }
     while(l<count1 && i<arr.length)
     {
         arr[i] = arr1[l];
         i++;
         l++;
     }

     while(m<count1 && i<arr.length)
     {
         arr[i] = arr2[m];
         i++;
         m++;
     }

    }
    public static void main(String[] args) {

    }
}
