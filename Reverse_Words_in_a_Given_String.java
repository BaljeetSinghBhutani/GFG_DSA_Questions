package GFG_DSA_Questions;

import java.util.Collections;
import java.util.Comparator;

public class Reverse_Words_in_a_Given_String {
  public  static String reverseWords(String S)
    {

//         Method -1

        String s1="";
        String a[]=S.split("[.]");
        for(int i=a.length-1;i>=0;i--)
        {
            s1+=a[i];
            if(i!=0)
                s1+=".";
        }
        return s1;

//        Method -2 (TLE)
//        String str = "";
//int i =S.length()-1;
//int j = S.length()-1;
//for(int k =S.length()-1; k>=0; k--)
//{
//    if(S.charAt(k)=='.')
//    {
//        j = k+1;
//
//        for(int i1  = j; i1<=i; i1++)
//        {
//            str+=S.charAt(i1);
//        }
//        str+='.';
//        j = k-1;
//        i=j;
//    }
//}
//String helper = "";
//for(int i1 =0; i1<S.length(); i1++)
//{
//    if(S.charAt(i1)=='.')
//    {
//        break;
//    }
//    else {
//        helper+=S.charAt(i1);
//    }
//}
//str = str + helper;
//return str;

    }
    public static void main(String[] args) {
String s  = "love.like.this.program.very.much";
String str  = reverseWords(s);
        System.out.println(str);

    }
}
