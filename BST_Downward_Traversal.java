package GFG_DSA_Questions;
class Node5{
    int data;
    Node5 left;
    Node5 right;
    Node5(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
public class BST_Downward_Traversal {
    Node5 result ;
    long ans  = 0;
    long verticallyDownBST(Node5 root,int target) {

        while (root!=null)
        {
            if(root.data>target)
            {
                 root = root.right;
            } else if (root.data<target) {
                root  = root.left;
            }
            else{
                break;
            }
        }
        if(root==null){
            return -1;
        }

        result = root;
        fun(result, 0);
        return ans;
 }

    private void fun(Node5 res, int dir) {
if(result!=null){
    fun(res.left, dir-1);
    fun(res.right, dir+1);

    if(res!=result &&  dir==0){
        ans+=res.data;
    }



}

    }

    public static void main(String[] args) {

    }
}
