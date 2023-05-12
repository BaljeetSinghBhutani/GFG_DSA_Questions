package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.Collections;

public class Number_is_sparse_or_not {
    public static boolean isSparse(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();

        while(n>0)
        {
            int per  = n%2;
            list.add(per);
            n= n/2;

        }
        Collections.reverse(list);
        System.out.println(list);
        for(int i =0; i<list.size()-1; i++)
        {
            if(list.get(i)== 1 && list.get(i+1)==1)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
boolean b= isSparse(41);
        System.out.println(b);
    }
}
