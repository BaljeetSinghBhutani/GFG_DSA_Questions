package GFG_DSA_Questions;
class Node7
{
    int data;
    Node7 next;

    Node7(int x){
        data = x;
        next = null;
    }
}
public class Reverse_Both_Parts {

    public static Node7 reverse(Node7 head, int k) {

   //finding the size of the linked list

        Node7 temp1 =  head;
        int n  = 0;
        while(temp1!=null){
            temp1 =  temp1.next;
            n++;
        }
        if (n == 1) {
            return head;
        }


        //Reverse first K nodes
        Node7 h1 = head;
        Node7 t1 =  h1.next;
        Node7 t2 = t1.next;
        for(int i =1; i<k; i++){

            t1.next = h1;

            h1 =  t1;
            t1  = t2;
            t2 = t2.next;

        }

        //Reverse last n-k nodes


        Node7 t3 = t2.next;


for(int i =1; i<n-k; i++){

    t2.next = t1;

    t1  = t2;
    t2  = t3;
    if(t3!=null) {
        t3 = t3.next;
    }

}

head.next = t2;

return h1;




    }
    public static void main(String[] args) {

    }
}
