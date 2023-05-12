package GFG_DSA_Questions;

import java.util.Arrays;

public class Minimum_Element_in_a_sorted_and_rotated_array {
   static int findMin(int arr[], int n)
    {

       int startIndex = 0;
       int EndIndex  = n-1;

           int mid = (startIndex + EndIndex) / 2;
if(mid-1 >=0 && arr[mid]<arr[mid-1])
{
    return arr[mid];
}

int i = mid-1;
int j =mid +1;

while(i>=0)
{
    if(i-1 >=0 && arr[i]<arr[i-1])
    {
        return arr[i];
    }
    i--;
       }

       while(j+1<n && j<n)
       {
           if(arr[j]>arr[j+1])
           {
               return arr[j];
           }
           j++;
       }
       if(arr[j]<arr[j-1])
       {
           return arr[j];
       }
       if(mid+1<n && arr[mid+1]>arr[0])
       {
           return arr[mid+1];
       }
       return arr[0];
    }
    public static void main(String[] args) {
       int arr[] =  {475, 478, 481, 500, 530, 545, 546, 552, 564, 582, 600, 603, 605, 611, 616, 642, 643, 670, 673, 676, 682 ,
               699 ,701 ,702, 710, 714, 740, 741, 743, 756, 757, 761, 766, 772, 773, 779, 780, 784, 786, 787 ,805, 818, 822, 824, 836, 838, 839,
               845, 846, 867, 869, 874, 879, 883, 898, 907, 908, 909, 910, 930, 934, 978, 996};

        System.out.println(arr.length);
//       2 4 9 12 26 30 32 46 47 58 62 64 71 115
//               119 128 129 133 136 146 154 156 157 160 164 187 192 196 199 202 209 210 215 228 233 248 262 ,271 ,288 ,299
//               311, 320, 331, 340, 346 ,359, 380, 383, 389 ,391, 397, 399, 414, 425, 439, 452, 458, 459, 461, 470, 472, 474};
//    int a  =   findMin(arr, arr.length);
//        System.out.println(a);
    }



}


