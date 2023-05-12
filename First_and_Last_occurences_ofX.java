package GFG_DSA_Questions;

import java.util.ArrayList;

public class First_and_Last_occurences_ofX {

    static  ArrayList<Long> find(long arr[], int n, int x)
    {
    ArrayList<Long> list1 = new ArrayList<Long>();
    ArrayList<Long> list2 = new ArrayList<Long>();
for(long i =0; i<arr.length; i++){
        if(arr[(int) i]==x){
            list1.add(i);
        }
    }
if(list1.size()==0){
    list2.add((long) -1);
    list2.add((long) -1);
}
else {
    list2.add(list1.get(0));
    list2.add(list1.get(list1.size() - 1));
}
return list2;

}
    public static void main(String[] args) {
long arr []= {1, 3, 5, 5, 5, 5, 67, 123, 125 };
ArrayList<Long>  list = find(arr, 9, 5);
        System.out.println(list);
    }
}
