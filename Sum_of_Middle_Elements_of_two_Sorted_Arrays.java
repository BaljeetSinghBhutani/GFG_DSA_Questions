package GFG_DSA_Questions;

import java.util.Arrays;

public class Sum_of_Middle_Elements_of_two_Sorted_Arrays {
   static int findMidSum(int[] ar1, int[] ar2, int n) {
       // code here

//       Method -2
int ans  =0;
       int i = 0;
       int j = 0;
       while (i < n && j < n) {
           if (ar1[i] < ar2[j]) {
               i++;
           } else {
//                swap
               int temp = ar1[i];
               ar1[i] = ar2[j];
               ar2[j] = temp;
               Arrays.sort(ar2);
               i++;
           }

       }
       System.out.println(Arrays.toString(ar1));
       System.out.println(Arrays.toString(ar2));
       ans = ar1[ar1.length-1] + ar2[0];
return ans;
   }

//        Method -1


//int ans[] = new int[2 * n];
//int k=0;
//int i =0, j =0;
//while (i<n && j<n)
//{
//    if(ar1[i]<ar2[j])
//    {
//        ans[k]  = ar1[i];
//        i++;
//    }
//    else {
//        ans[k] = ar2[j];
//        j++;
//    }
//    k++;
//}while(i<n){
//    ans[k] = ar1[i];
//    i++;
//    k++;
//
//        }while(j<n){
//    ans[k] = ar2[j];
//    j++;
//    k++;
//
//        }
//
//       System.out.println(Arrays.toString(ans));
//
//       int mid = (0 + (ans.length-1)) /2;
//int sum  =0;
//if(mid +1 < 2 *n && mid%2!=0)
//{
//    sum =  ans[mid] + ans[mid+1];
//}
//else if(mid -1 >=0 && mid %2==0){
//    sum = ans[mid]  + ans[mid -1];
//}
//return sum;




    public static void main(String[] args) {
int arr1[] = {5, 10, 12, 16, 17, 18, 22, 24, 27, 29, 29, 29};
int arr2[] = {5, 7,9, 10, 10, 13, 16, 18, 20, 22, 26, 29};

int ans = findMidSum(arr1, arr2, arr1.length);
        System.out.println(ans);
    }
}
