package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node
{
    int data;
    Node next;
    Node bottom;

    Node(int d)
    {
        data = d;
        next = null;
        bottom = null;
    }
}
public class Flattening_a_Linked_List {
    Node flatten(Node head)
    {
List<Integer> list  = new ArrayList<>();
Node temp = head;
while(temp!=null)
{
    list.add(temp.data);
    Node dummytemp= temp.bottom;
    while(dummytemp!=null)
    {
     list.add(dummytemp.data);
     dummytemp = dummytemp.next;
    }
    temp= temp.next;
}
        Collections.sort(list);
Node ans = new Node(list.get(0));
head = ans;
for(int i =1;i< list.size(); i++)
{
    Node result  = new Node(list.get(i));
   ans.next = result;
   ans = ans.next;
}
return head;


    }
}
