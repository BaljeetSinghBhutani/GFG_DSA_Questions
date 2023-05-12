package GFG_DSA_Questions;

public class Median_in_a_sorted_array {

    int median(int matrix[][], int R, int C) {
        // code here
        int start = 1;
        int end = 2000;

        int total_count = R * C;
        int mid_count=  total_count/2;
        while (start <= end) {

            int i = 0;
            int mid= (start+end)/2;
            int count = 0;
            while (i < R) {
                int arr[] = matrix[i];
                //   Apply
                int start1=  0;
                int end1= arr.length-1;
                if(arr[end1]<mid)
                {
                    count+=end1+1;
                }
                else {
                    for(int i1 =0; i1<arr.length;i1++)
                    {
                        if(arr[i1]<=mid){
                            count++;
                        }
                    }
                }

                i++;
            }

if(count>mid_count)
{
    end = mid-1;
}
else{
    start = mid+1;
}

        }
        return start;
    }

        public static void main(String[] args) {

    }
}


//  while (start1 <= end1) {
//                        if (arr[end1] < mid) {
//                            count += end1 + 1;
//                        }
//                        else {
//                        int mid1 =  (start1 + end1)/2;
//
//
//                        }
//                    }