package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.HashSet;

public class Task_Completion {
    static void completeTask(int n , int m, int[] arr)
    {
        HashSet<Integer> completed  = new HashSet<>();

        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();

        int k = 1;

        for (Integer ar:arr) {
            completed.add(ar);
        }
        for(int i=1;i<=n; i++)
        {
if(completed.contains(i))
{
    continue;
}

if(k%2!=0)
{
    p1.add(i);
    k++;
}
else{
    p2.add(i);
    k++;
}


        }

        System.out.println(p1);
        System.out.println(p2);

    }
    public static void main(String[] args) {
completeTask(15,6, new int[] {2, 5,6, 7, 9, 4});

    }
}
