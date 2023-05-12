package GFG_DSA_Questions;

import java.util.Arrays;

public class Allocate_Minimum_Number_of_Pages {
    public  static int books(int[] A, int B) {

//        Arrays.sort(A);
//        int low  =  A[0];
        int low = Integer.MAX_VALUE;
        int high = 0;
        int ans= 0;
        for(int i = 0; i<A.length; i++){
            if(low>A[i])
            {
                low= A[i];
            }
            high+=A[i];
        }

        while(low<=high){
            int mid = (low+high)>>1;
            if(allocationisPossible(A, mid, B)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low  = mid+1;
            }

        }
return low;
    }

    private static boolean allocationisPossible(int[] a, int barrier, int B) {
        int allocatedstudent =  1;
        int pages= 0;
        for(int i =0; i<a.length; i++)
        {
            if(a[i]>barrier){
                return false;
            }
            else if (pages+a[i]>barrier){
                allocatedstudent+=1;
                pages=0;
                pages+=a[i];
            }
            else{
                pages+=a[i];
            }
        }
        if(allocatedstudent>B){
            return false;
        }
        else{
            return true;
        }

    }

    public static void main(String[] args) {
int arr[] = { 73, 58, 30, 72, 44, 78, 23, 9 };
int B = 5;
int a  =books(arr, B);
        System.out.println(a);
    }
}
