package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_Array_in_groups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        ArrayList<Integer> arr2 = new ArrayList<>(n);
        int s = n;

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr.add(i, sc.nextInt());
        }
        System.out.println("Enter the value of K : ");
        int k = sc.nextInt();

//        Method -1

//     int count = 0;
//     int i= 0;
//     int k1 =0;
//     int l = k;
//     int k2 = k;
//
//     while(count<arr.size()) {
//
//         for (i = k1; i < k && count < arr.size(); i++) {
//             arr2.add(i, arr.get(l - 1));
//             count++;
//             l--;
//         }
//         k1 = count;
//         if(k2 + count < arr.size()){
//             k = k2+ count;
//         }
//         else{
//             k = arr.size();
//         }
//         l = k;
//     }
//        arr2.add(i, arr.get(l - 1));
//        else{
//            int k1 =0;
//            for(int i = n-1; i>=0; i--)
//            {
//                arr2.add(k1, arr.get(i));
//                k1++;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            arr.add(i, arr2.get(i));
//        }

//        for(int i1 =0; i1<n; i1++)
//        {
//            System.out.println(arr2.get(i1));
//        }


//        Method - 2

        int a = 0;
        int b = 0;
        int k1 = 0;
        int l = 0;
        k = l;
        int i = 0;
        int count = 0;

        while (i < n) {

            while (i < l){

                if(i<arr.size()){
                    break;
                }
                a = arr.get(i);
                b = arr.get(l - 1);

                arr.add(i, b);
                arr.add(l - 1, a);
                l--;
                i++;
                count++;
            }


            i = count;
            if (count + k < arr.size()) {
                l = count + k;

            } else {
                l = count;
            }


        }

        for(int i1 =0; i1<n; i1++)
        {
            System.out.println(arr.get(i1));
        }

    }
}
//5 77
//        35 56 48 21 87