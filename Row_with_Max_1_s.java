package GFG_DSA_Questions;

public class Row_with_Max_1_s {
    int rowWithMax1s(int arr[][], int n, int m) {
        int finalcount = 0;
        int index =-1;
     for(int i =0; i<arr.length;i++)
     {
         int count  = 0;
         for(int j =0; j<arr[0].length;i++)
         {
             if(arr[i][j]==1)
                 count++;
         }
         if(count>finalcount)
         {
index = i;
         }
     }
     return index;
    }
    public static void main(String[] args) {

    }
}
