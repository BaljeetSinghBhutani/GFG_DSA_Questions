package GFG_DSA_Questions;

public class Largest_Subtree_sum_in_a_tre {
    class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    }
    static int max = 0;
    public  static int helper(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int left  =  findLargestSubtreeSum(root.left);
        int right  =  findLargestSubtreeSum(root.right);
        max  = Math.max(max, left + right +  root.data);

        return left + right + root.data;
    }
    public static int findLargestSubtreeSum(Node root) {
        max = Integer.MIN_VALUE;
        helper(root);
        return max;

    }
    public static void main(String[] args) {

    }
}
