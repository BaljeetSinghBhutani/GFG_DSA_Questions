package GFG_DSA_Questions;

import java.util.Arrays;
import java.util.Collections;

public class Case_Specific_Sorting_of_String {
    public static String caseSort(String str) {


//        Method -3


//        Method -2 - Copied

        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        int lowCh = 0, UpCh = 0;

        while (lowCh < str.length() && arr[lowCh] >= 'A' && arr[lowCh] <= 'Z') {
            lowCh++;
        }


        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {

                sb.setCharAt(i, arr[lowCh]);

                lowCh++;

            } else {

                sb.setCharAt(i, arr[UpCh]);

                UpCh++;

            }

        }

        return sb.toString();

    }


        //Method -1 TLE

//          String strSmall =  "";
//          String strCapital =  "";
//
//          for(int i=0; i<str.length(); i++)
//          {
//            int a  =  str.charAt(i);
//            if(a>=97 && a<=122)
//            {
//                strSmall+=str.charAt(i);
//            }
//            else{
//                strCapital+=str.charAt(i);
//            }
//
//          }
//          char arr[] = strSmall.toCharArray();
//        Arrays.sort(arr);
//        strSmall =  new String(arr);
//
//
//        char array[] = strCapital.toCharArray();
//        Arrays.sort(array);
//        strCapital =  new String(array);
//
//
//        String ans = "";
//        int i1 =  0;
//        int j1 = 0;
//        for(int i =0; i<str.length(); i++)
//        {
//            int a  =  str.charAt(i);
//            if(a>=97 &&  a<=122)
//            {
//                ans+=strSmall.charAt(i1);
//                i1++;
//            }
//            else{
//                ans+=strCapital.charAt(j1);
//                j1++;
//            }
//        }
//
//return ans;


//    }
    public static void main(String[] args) {
String s  = "defRTSersUXI";
String ans = caseSort(s);
        System.out.println(ans);

    }
}
