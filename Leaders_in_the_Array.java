package GFG_DSA_Questions;


import java.util.ArrayList;
import java.util.Collections;

public class Leaders_in_the_Array {

    public static ArrayList<Integer> leaders(int arr[], int n) {
//        ArrayList<Integer> list = new ArrayList<>();

//
//        int max = Integer.MIN_VALUE;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            int j = i;
//            while (n > j) {
//                if (arr[j] >= max) {
//                    max = arr[j];
//                    j++;
//                } else {
//                    j++;
//                }
//            }
//            if (arr[i] >= max) {
//                list.add(arr[i]);
//            }
//        }
//        Collections.reverse(list);
//
//        return list;

//         Method - 3

        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);

        int maxTillnow = arr[n-1];

        for(int i = n-2; i>=0; i--){

            if(arr[i]>=maxTillnow){
                maxTillnow = arr[i];
                list.add(maxTillnow);
            }

        }
        Collections.reverse(list);
        return list;
    }



    public static void main(String[] args) {

        int arr[] = {16,17,4,3,5,2};
ArrayList<Integer> list = leaders(arr,arr.length);
for(int i=0; i< list.size(); i++)
{
    System.out.print(list.get(i)+ " ");
}

    }
}