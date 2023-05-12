package GFG_DSA_Questions;

import java.util.ArrayList;


public class Rabin_Karp {
    public static ArrayList<Integer> stringMatch(String str, String ptr) {
        ArrayList<Integer>  list = new ArrayList<>();
        int i1 =0;
        int j = 0;

        for(int i = 0; i<str.length();i++)
        {
            if(str.charAt(i)==ptr.charAt(j)){
                int j1 = j;
                 i1 =  i;

                 while(j1<ptr.length())
                 {
                     if(i1>=str.length() ||  str.charAt(i1)!=ptr.charAt(j1)){
                         break;
                     }
                     else{
                         j1++;
                         i1++;
                     }

                 }
                 if(j1==ptr.length())
                 {
                     list.add(i);
                 }
               j = 0;
            }
        }
        return list;

    }
    public static void main(String[] args) {
String str  = "BANANABANANA";
 String ptr = "AN";
 ArrayList<Integer> list =  stringMatch(str, ptr);
        System.out.println(list);

    }
}
