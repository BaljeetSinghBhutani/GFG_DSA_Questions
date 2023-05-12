package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.Collections;

public class Subset_Sums {
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
int sum = 0;
ArrayList<Integer> list = new ArrayList<>();
int index = 0;
list =  subset(arr, sum, index, list);
        Collections.sort(list);
        return list;

    }


    public  static ArrayList<Integer> subset(ArrayList<Integer> arr, int sum, int index ,ArrayList<Integer> ans){
        if(index==arr.size()){
      ans.add(sum);
return ans;
        }


            subset(arr, sum + arr.get(index), index+1, ans);
            subset(arr, sum, index+1,ans);

            return ans;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
ArrayList<Integer>  ans  = subsetSums(list, list.size());
        System.out.println(ans);
    }
}
