package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstElement_to_occur_K_times {

    public static void main(String[] args) {

        int arr[] = {4, 2, 2, 2, 3, 4 ,4, 4 ,3, 2};
        System.out.print("Enter the value of K:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
int count =0;
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        int k1 =0;

        for(int i =0; i<arr.length; i++)
        {
            for(int j =i+1; j<arr.length; j++){
                if(arr[i]==arr[j])
                {
                    count++;
                }


            }
            if(count ==k){
                array.add(k1, arr[i]);
                k1++;
            }

        }
        int i1 = arr.length-1;
        int k2 =0;
        for(int i = 0; i< array.size(); i++)
        {       int j = array.get(i);
            while(i1!=-1){
     if(arr[i1]==j){
         array2.add(i1);
         break;
     }
     i1--;
            }
        }
int min = Integer.MAX_VALUE;
        int index =0;
        for(int i =0; i< array2.size(); i++)
        {
            if(array2.get(i)<min)
            {
                min = array.get(i);
                index = i;
            }
        }
        System.out.println(array.get(index));

    }
}
