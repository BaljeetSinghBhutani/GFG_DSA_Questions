package GFG_DSA_Questions;

import java.util.Arrays;

public class Find_Pair_Given_Difference {
    public boolean findPair(int arr[], int size, int n)
    {

//         Method -2

        Arrays.sort(arr);

for(int i =0; i<size; i++)
{
    int sum = arr[i] + n;
   for(int j =i+1; j<n; j++)
   {
       if(sum ==arr[j])
       {
           return true;
       }
   }
}

return false;




//         Method -1

//for(int i =0; i<size; i++)
//{
//    for(int j =0; j<size; j++)
//    {
//        if(arr[i]-arr[j]==n || arr[i]-arr[j]==-n)
//        {
//            return true;
//        }
//    }
//}
//return false;
    }
    public static void main(String[] args) {

    }
}
