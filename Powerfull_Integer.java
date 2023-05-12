package GFG_DSA_Questions;

import java.util.*;

public class Powerfull_Integer {
    public static int powerfullInteger(int n, int interval[][], int k) {

//        Method -2
        int  ans = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++)
        {
            max = Math.max(max, interval[i][1]);
        }

        int arr [] =  new int[max +2];
        for(int i = 0; i<n; i++)
        {
            arr[interval[i][0]] +=1;
            arr[interval[i][1] +1]-=1;

        }


for(int i  =1 ; i<arr.length; i++)
{
    arr[i] =  arr[i-1] +  arr[i];
    if(arr[i]>=k)
    {
        ans =  i;
    }
}


return ans;










    }

//        Method -1 TLE
//        int ans = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int arr[] = interval[i];
//            int start = arr[0];
//            int end = arr[1];
//
//            while (start <= end) {
//                if (map.containsKey(start)) {
//                    map.put(start, map.get(start) + 1);
//
//                } else {
//                    map.put(start, 1);
//                    list.add(start);
//                }
//                start++;
//            }
//        }
//        int max = -1;
//        for (int i = 0; i < list.size(); i++) {
//            int a = map.get(list.get(i));
//            if (a >= k) {
//                max = Math.max(list.get(i), max);
//            }
//        }
//
//        ans = max;
//
//        return ans;
//
//    }

    public static void main(String[] args) {
        int interval[][] = { {11 ,11},
                {14 ,17},
                {16, 20},
                {7, 26},
                {5, 5},
                {10, 19},
                {5 ,11}};
        int n = 7;
        int k = 2;

        int a = powerfullInteger(n, interval, k);

        System.out.println(a);

    }
}