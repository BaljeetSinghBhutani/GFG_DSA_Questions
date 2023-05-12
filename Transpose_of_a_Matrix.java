package GFG_DSA_Questions;

public class Transpose_of_a_Matrix {
   public static void transpose(int matrix[][], int n)
    {
        for(int  i =0; i< matrix.length; i++)
        {
            for(int j =0; j<matrix.length; j++)
            {
                int temp  = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }



// Method - 1

//         Brute Force Solution
//        int rows = 0;
//        int cols = 0;
//        int ans[][] = new int[matrix.length][matrix.length];
//        for(int i =0; i< matrix.length; i++)
//        {
//            for(int j =0; j< matrix.length; j++)
//            {
//                ans[rows][cols] = matrix[i][j];
//                rows++;
//            }
//            rows  =0;
//            cols++;
//        }
//
//for(int  i =0; i< ans.length;i++)
//{
//    for(int j=0; j<ans.length; j++)
//    {
//        matrix[i][j] =  ans[i][j];
//    }
//}
    }
    public static void main(String[] args) {

    }
}
