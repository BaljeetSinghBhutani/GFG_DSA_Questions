package GFG_DSA_Questions;

import javax.naming.ldap.HasControls;
import java.util.HashMap;

public class Sum_of_Beauty_of_all_the_Strings {
    public static int beautySum(String s) {
//        Method -2

        int ans = 0;
        int n = s.length();

        for(int i = 0; i<s.length(); i++){
            int freq[] = new int [26];

            for(int j =i; j<n; j++){
                freq[s.charAt(j)-'a']++;

                int min =  getMin(freq);
                int max = getMax(freq);

                int beauty = max - min;

                ans+=beauty;
            }
        }
        return ans;


    }
    static int getMax(int freq[]){
        int max = Integer.MIN_VALUE;

        for(int i =0; i<26; i++){
            if(freq[i]!=0){
                max = Math.max(max, freq[i]);
            }
        }
        return max;
    }
    static int getMin(int freq[]){
        int min = Integer.MAX_VALUE;

        for(int i =0; i<26; i++){
            if(freq[i]!=0){
                min = Math.min(min, freq[i]);
            }
        }
        return min;
    }



//Method -1
//        int ans = 0;
//
//
//        for(int i =0; i<s.length(); i++)
//        {
//            for(int j =i; j<s.length(); j++)
//            {
//                int frequency [] = new int[26];
//                String str = s.substring(i ,j+1);
//
//                int k  =0;
//                while (k<str.length()) {
//                    int freq = str.charAt(k)-'a';
//                    if(frequency[freq]==0){
//                        frequency[freq]=1;
//                    }
//                    else{
//                        int d = frequency[freq];
//                        frequency[freq] = d+1;
//                    }
//                    k++;
//                }
//
////                find min and max in this frequency array
//                int max = Integer.MIN_VALUE;
//                int min = Integer.MAX_VALUE;
//                int beauty =  0;
//                for(int i1 = 0; i1<frequency.length; i1++)
//                {
//                    if(frequency[i1]!=0){
//                        min = Math.min(min, frequency[i1]);
//                        max =  Math.max(max, frequency[i1]);
//                    }
//
//                }
//                beauty= max - min;
//                ans+=beauty;
//            }
//        }
//return ans;

    public static void main(String[] args) {
String s= "geeksforgeeks";
int ans = beautySum(s);
        System.out.println(ans);
    }
}
