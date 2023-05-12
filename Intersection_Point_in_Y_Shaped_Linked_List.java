package GFG_DSA_Questions;
class Node4 {
    int data;
    Node4 next;
    Node4(int d)  {
        data = d;
        next = null; }
}

class LinkedList
{
    Node4 head;  // head of list
}
public class Intersection_Point_in_Y_Shaped_Linked_List {
    int intersectPoint(Node4 head1, Node4 head2)
    {
Node4 d1  = head1;
Node4 d2 = head2;

while(d1!=null && d2!=null)
        {
            d1 =  d1.next;
            d2 = d2.next;

            if(d1==null && d2!=null)
            {
                d1 =  head2;
            }

            if(d2==null && d1!=null)
            {
                d2 =  head1;
            }
            if(d1==d2){
                return d1.data;
            }
        }

return -1;



    }
    public static void main(String[] args) {

    }
}
