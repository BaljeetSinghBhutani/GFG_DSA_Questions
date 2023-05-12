package GFG_DSA_Questions;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class Remove_all_Duplicates_from_a_Given_String {
    String removeDuplicates(String str) {

        String ans ="";
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<str.length(); i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i)) +1);
            }
            else {
                map.put(str.charAt(i), 1);
                ans+=str.charAt(i);
            }

        }
        return str;
    }
    public static void main(String[] args) {


    }
}
