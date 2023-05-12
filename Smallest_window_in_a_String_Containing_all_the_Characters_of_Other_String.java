package GFG_DSA_Questions;

import java.util.HashMap;

public class Smallest_window_in_a_String_Containing_all_the_Characters_of_Other_String {
    public static String smallestWindow(String s, String p)
    {

        String ans = "";
        HashMap<Character, Integer> map1  = new HashMap<>();
        HashMap<Character, Integer> map2  = new HashMap<>();

        for(int i= 0; i<p.length(); i++)
        {
            char ch =  p.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
        }

        int i = -1;
        int j = -1;
        int fct = 0;
        int act = map2.size();


        while (true)
        {
            boolean flag1 = false;
            boolean flag2 = false;

            while (i<s.length()-1 && fct<act){
                flag1  =  true;
                i++;
                char ch = s.charAt(i);
                map1.put(ch, map1.getOrDefault(ch, 0)+1);
                if(map1.getOrDefault(ch, 0)<=map2.getOrDefault(ch, 0))
                {
                    fct++;
                }

            }



            while (j<i &&  fct ==act){
                flag2 = true;
                String str  = s.substring(j+1, i+1);
                if(ans.length() == 0 || str.length()<ans.length()){
                    ans =  str;
                }
       j++;

                char ch  = str.charAt(j);
                if(map1.get(ch)<=1)
                {
                    map1.remove(ch);
                }
                else{
                    map1.put(ch, map1.get(ch)-1);
                }
if(map1.getOrDefault(ch, 0)<map2.getOrDefault(ch, 0))
{
    fct--;
}

            }
if(!flag1 && !flag2)
{
    break;
}
        }

return ans;
    }
    public static void main(String[] args) {

    }
}
