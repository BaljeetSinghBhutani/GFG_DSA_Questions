package GFG_DSA_Questions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

class Node2 {
    int data;
    Node2 left;
    Node2 right;

    Node2(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
public class Maximum_Value {
    ArrayList<Integer> maximumValue(Node2 node) {

        ArrayList<Integer> list  = new ArrayList<>();
        Queue<Node2> queue = new ArrayDeque<>();
        queue.add(node);

        while(!queue.isEmpty())
        {

            int n = queue.size();
            int max =  Integer.MIN_VALUE;
            for(int i =0; i<n; i++)
            {
                Node2 temp = queue.poll();
                max = Math.max(temp.data, max);

                if(temp.left!=null)
                {
                    queue.add(temp.left);
                }
                if(temp.right!=null)
                {
                    queue.add(temp.right);
                }
            }
            list.add(max);

        }
        return list;

    }
    public static void main(String[] args) {

    }
}
