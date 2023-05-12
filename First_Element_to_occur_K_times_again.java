package GFG_DSA_Questions;

import java.util.HashMap;

public class First_Element_to_occur_K_times_again {

    public static int firstElementKTime(int[] a, int n, int k) {
        if(k==1){
            return a[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<a.length; i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i]) +1);
                if(map.get(a[i])>=k)
                {
                    return a[i];
                }
            }
            else {
                map.put(a[i], 1);
            }
        }


        return -1;
    }

        public static void main(String[] args) {
int arr[] = {1, 7, 4, 3, 4, 8 ,7};
int a  = firstElementKTime(arr, arr.length, 2);
            System.out.println(a);
    }
}
