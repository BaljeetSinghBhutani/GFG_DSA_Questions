package GFG_DSA_Questions;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String a,String b)
    {
if(a.length()!=b.length())
{
    return false;
}

char[] arr1 = a.toCharArray();
char[] arr2 = b.toCharArray();

Arrays.sort(arr1);
Arrays.sort(arr2);

if(Arrays.equals(arr1, arr2)){
    return true;
        }
return false;
// Method -2 - failed
// HashMap<Character, Integer> map1 = new HashMap<>();
// HashMap<Character, Integer> map2 = new HashMap<>();
//
//for(int i =0; i<a.length(); i++)
//{
//    if(map1.containsKey(a.charAt(i)))
//    {
//        map1.put(a.charAt(i) ,map1.get(a.charAt(i) +1));
//    }
//    else {
//        map1.put(a.charAt(i), 1);
//    }
//}
//
//
//for(int i =0; i<b.length(); i++)
//{
//    if(map2.containsKey(b.charAt(i)))
//    {
//        map2.put(b.charAt(i) ,map2.get(b.charAt(i) +1));
//    }
//    else {
//        map2.put(b.charAt(i), 1);
//    }
//}
//
//if(map1.equals(map2))
//{
//    return true;
//}
//return false;

//Method -1
//        Character arr1[]  = new Character[a.length()];
//        Character arr2[]  = new Character[b.length()];
//        for(int i =0; i<a.length(); i++)
//        {
//            arr1[i] = a.charAt(i);
//        }
//        Arrays.sort(arr1);
//
//        for(int i =0; i<b.length(); i++)
//        {
//            arr2[i] = b.charAt(i);
//        }
//        Arrays.sort(arr2);
//
//for(int i =0; i<a.length(); i++)
//{
//    if(arr1[i]!=arr2[i])
//    {
//        return false;
//    }
//}
//return true;
    }
    public static void main(String[] args) {
String a = "geeksforgeeks";
String b = "forgeeksgeeks";


    }
}
