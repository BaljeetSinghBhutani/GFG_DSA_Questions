package GFG_DSA_Questions;

public class Smallest_Subaray_With_Sum_Greater_than_X {

    public static int smallestSubWithSum(int a[], int n, int x) {

//         Method -2 - Sliding Window

        int startIndex = 0;
        int EndIndex = 0;

        int count = n;
        int sum = 0;


        while (EndIndex < n) {

            while (sum <= x && EndIndex < n) {
                sum += a[EndIndex];
                EndIndex++;
            }
            while (sum > x && startIndex < n) {
                int count1 = (EndIndex - startIndex) ;
                if (count1 < count) {
                    count = count1;
                }
                sum -= a[startIndex];
                startIndex++;

            }

        }
        return count;


    }












//        Method -1
//Time Complexity O(n * n)
//        for (int i = 0; i < n; i++) {
//            if (a[i] > x) {
//                return 1;
//            }
//        }
//        int i = 0;
//
//        int count1  = Integer.MAX_VALUE;
//        while (i < n) {
//
//           for(int i1 = n-1; i1>=0; i1-- )
//           {
//               int sum1= 0;
//               int count = 0;
//for(int j1  =  i; j1<=i1; j1++)
//               {
//                   sum1+=a[j1];
//                   count++;
//               }
//if(sum1>x)
//{
//    if(count<count1)
//    {
//        count1  = count;
//    }
//}
//
//            }
//
//
//
//i++;
//        }
//        return count1;
//    }
    public static void main(String[] args) {
int arr[] = {1, 4, 45, 6, 0, 19};
int x= 51;
int a  = smallestSubWithSum(arr, arr.length, x);
        System.out.println(a);
    }
}
