package GFG_DSA_Questions;

import java.util.HashMap;

public class Majority_Element {
    static int majorityElement(int a[], int size)
    {
   int count  = size/2;

        HashMap<Integer, Integer>  map = new HashMap<>();
        for(int i =0; i <size; i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i]) + 1);
            }
            else
            {
                map.put(a[i], 1);
            }
        }
for(int  i =0; i<a.length; i++)
{
    if(map.get(a[i])>count)
    {
        return a[i];
    }

        }
return -1;
    }
    public static void main(String[] args) {

    }
}
