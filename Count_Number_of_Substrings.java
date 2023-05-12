package GFG_DSA_Questions;

import java.util.HashMap;

public class Count_Number_of_Substrings {

   long  solutionforK1(String str)
   {
       long  ans  = 0;
HashMap<Character, Integer> map  = new HashMap<>();
int i= -1;
int j  =-1;

while (true)
{
    boolean flag1  =  false;
    boolean flag2  =  false;
    while (i<str.length()-1)
    {
        flag1 = true;
        i++;
        char ch  =  str.charAt(i);

        map.put(ch, map.getOrDefault(ch, 0)+1);
         if(map.size()>1)
         {
             if(map.get(ch)==1)
             {
                 map.remove(ch);

             }
             else{
                 map.put(ch, map.get(ch)-1);
             }
             i--;
             break;
         }
    }
    while (j<i)
    {
        flag2  = true;
        if(map.size()==1)
        {
            ans+=i-j;
        }
        j++;
        char ch =  str.charAt(j);
        if(map.get(ch)==1)
        {
            map.remove(ch);

        }
        else{
            map.put(ch, map.get(ch)-1);
        }
if(map.size()==0)
{
    break;
}
    }

    if(!flag1 && !flag2)
    {
        break;
    }
}

       return ans;
   }
    long substrCount (String S, int k) {
 long ans  = 0;

 if(k==1){
     return solutionforK1(S);
 }

        HashMap<Character, Integer> mapb = new HashMap<>();
        HashMap<Character, Integer> maps = new HashMap<>();

        int is = -1;
        int ib = -1;
        int j = -1;

        while (true)
        {
            boolean f1 = false;
            boolean f2 = false;
            boolean f3 = false;
             while (ib<S.length()-1)
             {
                 f1  = true;
                 ib++;
                 char ch = S.charAt(ib);
                 mapb.put(ch, mapb.getOrDefault(ch, 0)+1);

                 if(mapb.size()>k)
                 {
                     if(mapb.get(ch)==1)
                     {
                         mapb.remove(ch);
                     }
                     else{
                         mapb.put(ch, mapb.get(ch)-1);
                     }
                     ib--;
                     break;
                 }
             }

             while (is<ib)
             {
                 f2 = true;
                 is++;
                 char ch = S.charAt(is);
                 maps.put(ch, maps.getOrDefault(ch, 0)+1);
                 if(maps.size()==k){
                     if(maps.get(ch)==1)
                     {
                         maps.remove(ch);
                     }
                     else{
                         maps.put(ch, maps.get(ch)-1);
                     }
                     is--;
                     break;
                 }

             }


             while (j<is)
             {
                 f3  =  true;
                 if(mapb.size()==k && maps.size()==k-1)
                 {
                     ans+=ib-is;
                 }

                 j++;
                 char ch = S.charAt(j);
                 if(mapb.get(ch)==1)
                 {
                     mapb.remove(ch);
                 }
                 else{
                     mapb.put(ch, mapb.get(ch)-1);
                 }



                 if(maps.get(ch)==1)
                 {
                     maps.remove(ch);
                 }
                 else{
                     maps.put(ch, maps.get(ch)-1);
                 }

                 if(maps.size()<k-1 || mapb.size()<k)
                 {
                     break;
                 }
             }

             if(!f1 && !f2  &&  !f3)
             {
                 break;
             }

        }



 return ans;


    }
    public static void main(String[] args) {

    }
}
