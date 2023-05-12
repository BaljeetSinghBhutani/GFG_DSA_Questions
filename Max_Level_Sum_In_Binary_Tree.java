package GFG_DSA_Questions;

import java.util.ArrayDeque;
import java.util.Queue;


public class Max_Level_Sum_In_Binary_Tree {
    public int maxLevelSum(Node2 root) {


        if(root==null){
            return 0;
        }
        Queue<Node2> queue = new ArrayDeque<>();
        int sum  = 0;
        queue.add(root);

        int res = Integer.MIN_VALUE;

        while (!queue.isEmpty()){
            sum  = 0;
            int n =  queue.size();

            for(int i =0; i<n; i++)
            {
                Node2  node  = queue.poll();
                sum+=node.data;
                if(node.left!=null)
                {
                    queue.add(node.left);
                }
                if(node.right!=null)
                {
                    queue.add(node.right);
                }
            }
            res = Math.max(sum, res );
        }
        return res;

    }



    public static void main(String[] args) {

    }
}
