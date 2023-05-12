package GFG_DSA_Questions;

import java.util.Arrays;
import java.util.HashMap;

public class Array_Subset_of_another_Array {
    public static String isSubset( long a1[], long a2[], long n, long m) {
        int count  =0;
        HashMap<Long, Boolean> map = new HashMap<>();
        for(int i =0; i<m; i++)
        {
                map.put(a2[i], false);
        }

for(int i=0; i<n; i++)
{
    if(map.containsKey(a1[i]))
    {
        if(map.get(a1[i])==true)
        {

        }
        else{
     map.put(a1[i], true);
            count++;
        }
    }
}
if(count>=m){
    return "Yes";
}
else {
    return "No";
}

    }
    public static void main(String[] args) {
long arr1[] = {11, 1, 13, 21, 3, 7};
long arr2[] = {11, 3, 7, 1};
String s  = isSubset(arr1, arr2,  arr1.length, arr2.length);
        System.out.println(s);

    }
}
