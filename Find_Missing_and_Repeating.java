package GFG_DSA_Questions;

import java.util.Arrays;
import java.util.HashMap;

public class Find_Missing_and_Repeating {
   static int[] findTwoElement(int arr[], int n) {
int ans[] = new int[2];

HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

for(int i =0; i<arr.length; i++)
{
    if(map.containsKey(arr[i]))
    {
        map.put(arr[i], true);
        ans[0] = arr[i];
    }
    else{

        map.put(arr[i], true);
    }
}
map.put(0, true);
for(int i =1; i<=n; i++)
{
    if(!map.containsKey(i))
    {

            ans[1] = i;

    }
}
return ans;

    }
    public static void main(String[] args) {
int arr[] = {2, 2};
arr = findTwoElement(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
