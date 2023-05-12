package GFG_DSA_Questions;

import java.util.HashMap;

public class Find_First_Repeated_Character {
    String firstRepChar(String s)
    {
        HashMap<Character, Integer>  map = new HashMap<>();
        String s1 = "";
        for(int i =0; i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                if (map.get(s.charAt(i)) >= 2) {
                    return s1 + s.charAt(i);
                }
            }
                else{
                    map.put(s.charAt(i), 1);
                }
            }


        return "-1";

    }
    public static void main(String[] args) {

    }
}
