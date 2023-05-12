package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Uncomman_Characters {
    String UncommonChars(String A, String B)
    {
        ArrayList<Character> list = new ArrayList<>();
        HashMap<Character, Integer>  map1 = new HashMap<>();
        HashMap<Character, Integer>  map2 = new HashMap<>();
        for(int  i =0; i<A.length(); i++)
        {
            if(map1.containsKey(A.charAt(i)))
            {
                map1.put(A.charAt(i), map1.get(A.charAt(i) +1 ) );
            }
            else{
                map1.put(A.charAt(i), 1);
            }
        }

        for(int j =0; j<B.length(); j++)
        {
            if(map2.containsKey(B.charAt(j)))
            {
                map2.put(B.charAt(j), map2.get(B.charAt(j) +1));
            }
            else{
                map2.put(B.charAt(j), 1);
            }
        }


        for(int i=0; i<A.length();i++)
        {
            if(!map2.containsKey(A.charAt(i)))
            {
                list.add(A.charAt(i));
            }
        }
        for(int i=0; i<B.length();i++)
        {
            if(!map1.containsKey(B.charAt(i)))
            {
                list.add(B.charAt(i));
            }
        }
        if(list.isEmpty()){
            return "-1";
        }
//        Collections.sort(list);
        HashMap<Character, Integer>  map = new HashMap<>();
        for(int i =0; i< list.size(); i++)
        {
            if(map.containsKey(list.get(i)))
            {
                map.put(list.get(i), map.get(list.get(i) +1));
            }
            else {
                map.put(list.get(i), 1);
            }
        }
        String s ="";
        ArrayList<Character>  list1 =  new ArrayList<>();
        for (Character ch: map.keySet()) {
            list1.add(ch);
        }
        Collections.sort(list1);
        for(int i=0; i< list1.size(); i++)
        {
            s+=list1.get(i);
        }
       return s;
    }
    public static void main(String[] args) {

    }
}
