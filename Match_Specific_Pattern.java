package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Match_Specific_Pattern {
    public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
    {

        ArrayList<String> ans = new ArrayList<>();
        HashMap<Character, Integer>  map  =  new HashMap<>();
        HashSet<Character> set  =  new HashSet<>();
        for(int i =0; i<pattern.length();i++)
        {
            map.put(pattern.charAt(i), map.getOrDefault(pattern.charAt(i), 0)+1);
            set.add(pattern.charAt(i));
        }

        int arr1 [] = new int[map.size()];
        int k  =0;

        for (Character ch: set) {
            arr1[k] =  map.get(ch);
            k++;
        }


        for(int i =0; i<dict.size(); i++)
        {
            HashMap<Character, Integer>  map1  =  new HashMap<>();
            String s  = dict.get(i);
            if(s.length()==pattern.length())
            {
                for(int j = 0; j<s.length(); j++)
                {
                    map1.put(s.charAt(j), map1.getOrDefault(s.charAt(j), 0)+1);
                }
               int arr2 [] = new int[map1.size()] ;

                if(map.size()==map1.size())
                {
                    int k1  =0;

                    for (Character ch: set) {
                        arr2[k1] =  map.get(ch);
                        k1++;
                    }

                    boolean flag  = true;
                    for(int i1 = 0; i1<arr1.length; i1++)
                    {
                        if(arr1[i1]!=arr2[i1])
                        {
                            flag = false;
                            break;
                        }
                    }
                    if(flag)
                    {
                        ans.add(s);
                    }
                }

            }


        }

        return ans;


    }
    public static void main(String[] args) {

    }
}
