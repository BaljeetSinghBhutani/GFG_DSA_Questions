package GFG_DSA_Questions;

import java.util.HashMap;

public class Count_Pair_Sum_in_Matrices {
    static char nonrepeatingCharacter(String s)
    {

//        Method =2
        int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        for(char c='a'; c<='z';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index's which are occured once
            // but our answer is lowest index
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        return ans==Integer.MAX_VALUE?'$':s.charAt(ans);



//        Method -1
//        HashMap<Integer, Integer> map  = new HashMap<>();
//        for(int i =0; i<n; i++)
//        {
//            for(int j = 0; j<n; j++)
//            {
//                map.put(mat2[i][j], map.getOrDefault(mat2[i][j], 0) +1);
//            }
//        }
//
//        int count = 0;
//        for(int i =0; i<n; i++)
//        {
//            for(int j = 0; j<n; j++) {
//                int sum  = x -  mat1[i][j];
//                if(map.containsKey(sum))
//                {
//                    if(map.get(sum)==1)
//                    {
//                        map.remove(sum);
//                    }
//                    else{
//                        map.put(sum, map.get(sum)-1);
//                    }
//                    count++;
//                }
//            }
//
//        }
//
//
//        return count;


    }
    public static void main(String[] args) {

    }
}
