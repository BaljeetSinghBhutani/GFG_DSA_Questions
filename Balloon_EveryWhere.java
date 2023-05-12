package GFG_DSA_Questions;

import java.io.CharConversionException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Balloon_EveryWhere {
    public int maxInstance(String s) {
//balloon

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i  =0; i<s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'b' || s.charAt(i) == 'l' || s.charAt(i) == 'o' || s.charAt(i) == 'n') {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
                }
            }
        }
            map.put('l', map.get('l') / 2);
            map.put('o', map.get('o') / 2);

int count  = 0;

for (char x : map.keySet()){
   count =   Math.min(count, map.get(x));

}
            return count;

        }


    public static void main(String[] args) {

    }
}
