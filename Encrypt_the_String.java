package GFG_DSA_Questions;

import java.util.Collections;
import java.util.*;

public class Encrypt_the_String {
    String encryptString(String s)
    {

       StringBuilder str = new StringBuilder();
str.append(s.charAt(0));
        int count = 1;
       for(int i = 1; i<s.length() ; i++)
       {

           if(s.charAt(i)!=s.charAt(i-1)){
               str.append(count);
               str.append(s.charAt(i));
               count = 1;
           }
           else {
               count ++;
           }
       }
       str.append(count);



       return str.reverse().toString();

    }
    public static void main(String[] args) {

    }
}
