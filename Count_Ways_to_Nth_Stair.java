package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.HashMap;

public class Count_Ways_to_Nth_Stair {

    public static long nthStair(int n)
    {
        ArrayList<String> ans  = Stairs(n);
        System.out.println(ans);
  return ans.size();



    }

    public static ArrayList<String> Stairs(int n){
        if(n==0){
            ArrayList<String> list  = new ArrayList<>();
            list.add("");
            return list;
        }
        if(n<0){
            ArrayList<String> res  = new ArrayList<>();
            return res;
        }

        ArrayList<String> list1 = Stairs(n-1);
        ArrayList<String> list2 = Stairs(n-2);
        ArrayList<String> ans = new ArrayList<>();

        for (String str: list1
             ) {
            ans.add(1 +  str);
        }
        for (String str: list2
             ) {
            ans.add(2 +  str);
        }

        return ans;
    }

    public static void main(String[] args) {
Long a   = nthStair(4);
        System.out.println(a);
    }
}
