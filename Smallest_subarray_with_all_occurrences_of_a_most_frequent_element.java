package GFG_DSA_Questions;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Smallest_subarray_with_all_occurrences_of_a_most_frequent_element {
    ArrayList<Integer> smallestSubsegment(int a[], int n)
    {
          ArrayList<Integer> ans  = new ArrayList<>();

//element vs frequency
HashMap<Integer, Integer> map1 = new HashMap<>();
//element vs first Occurrence
HashMap<Integer, Integer> map2 = new HashMap<>();

int hf  = 0 ;
int st   =0;
int ed    = 0;
int length  = 0;

for(int i =0; i<a.length; i++)
{
//    map1.put(a[i], map1.getOrDefault(a[i], 0)+1);
    if(map1.containsKey(a[i]))
    {
        map1.put(a[i], 1);
    }
    else{
        map1.put(a[i], map1.get(a[i])+1);
    }

    if(!map2.containsKey(a[i]))
    {
        map2.put(a[i], i);
    }

    int pfq  =  map1.get(a[i]);
    if(pfq>hf)
    {
        hf  =  pfq;
        st  = map2.get(a[i]);
        ed =  i;
        length = st-ed+1;
    }
else if(pfq==hf)
    {
        int stpt  = map2.get(a[i]);
        int edpt  = i;
        int plen =  stpt - edpt +1;

        if(plen<length)
        {
            length =  plen;
            st = stpt;
            ed = edpt;
        }
    }

}



for(int i =st; i<ed ; i++)
{
    ans.add(a[i]);
}



        return ans;
    }
    public static void main(String[] args) {

    }
}
