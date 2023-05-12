package GFG_DSA_Questions;

public class Maximum_Number_of_1s_row {
    public static int maxOnes (int Mat[][], int N, int M)
    {
        int row_max = 0;
        int row_index = 0;
     for(int i=0; i< Mat.length; i++)
     {int count  =0;
         for(int j =0;j <Mat[0].length; j++)
         {
             if(Mat[i][j]==1){
                 count++;

             }
         }
         if(count>row_max)
         {
             row_max = count;
             row_index =i;
         }
     }
return row_index;

    }
    public static void main(String[] args) {
int arr[][] =
        {{0, 1},
                {1, 1}
};

int a  =maxOnes(arr, arr.length, arr[0].length);
        System.out.println(a);
    }
}
