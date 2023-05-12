package GFG_DSA_Questions;

import java.util.HashMap;

public class Elements_in_the_Range {

   public  boolean check_elements(int arr[], int n, int A, int B)
    {
int count  = 0;
int total = (A-B) +1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(int i=A; i<=B; i++){
            if(map.containsKey(i)){
         continue;
            }
            else{
                return false;
            }
        }
return true;

    }
    public static void main(String[] args) {

    }
}
