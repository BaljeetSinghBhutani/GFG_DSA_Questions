package GFG_DSA_Questions;

public class Search_in_a_rotated_Array {
   static int search(int arr[], int startIndex, int endIndex, int key) {
        startIndex  =0;
        endIndex  = arr.length-1;
        while (startIndex <= endIndex) {
            int mid = (startIndex + endIndex) / 2;
            if (arr[mid] == key) {
                return mid;
            }
// Check whether the left part is sorted or not
            if(arr[mid]>arr[startIndex])
            {
                if(arr[startIndex]<=key && arr[mid]>key)
                {
                    endIndex = mid -1;
                }
                else{
                    startIndex = mid+1;
                }
            }

//            check whether the right part is sorted or not
            else{
                if(arr[mid]<key && arr[endIndex]>=key)
                {
                    startIndex = mid+1;
                }
                else {
                    endIndex = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
int arr[] = {3, 1};
int a  =search(arr, 0, arr.length-1, 1);
        System.out.println(a);


    }
}
