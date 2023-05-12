package GFG_DSA_Questions;

import java.util.HashMap;

public class Repeated_Character {
public static char firstRep(String S)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        int count  = 0;
        char chr[]  = new char[count];
        int k =0;
for(int i =0; i<S.length(); i++)
{
    if(map.containsKey(S.charAt(i)))
    {
        map.put(S.charAt(i), map.get(S.charAt(i)) +1);
//        if(map.get(S.charAt(i))==2){
//            count++;
//           chr[k]= S.charAt(i);
//           k++;
//
//        }
    }
    else{
        map.put(S.charAt(i), 1);
    }
}

for(int i =0; i<S.length(); i++)
{
    if(map.get(S.charAt(i))>=2){
        return S.charAt(i);
    }
}

return '#';
    }
    public static void main(String[] args) {
String s = "abcde";
char c = firstRep(s);
        System.out.println(c);
    }
}
