package GFG_DSA_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Absolute_List_Sorting {


    Node sortList(Node head) {

// 		Method  - 1
        ArrayList<Integer> list = new ArrayList<>();

        while(head!=null)
        {
        list.add(head.data);
        head = head.next;
        }
        Collections.sort(list);
        Node start  =  new Node(list.get(0));
        Node temp  = start;
        for(int i =1;i<list.size(); i++)
        {
            start.next = new Node(list.get(i));
            start = start.next;

        }
        return temp;
    }
    public static void main(String[] args) {

    }
}

