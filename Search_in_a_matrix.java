package GFG_DSA_Questions;

public class Search_in_a_matrix {
    public static int matSearch(int mat[][], int N, int M, int X) {
        int row_start =0;
        int row_end = mat.length-1;

        int col_start = 0;
        int col_end  = mat[0].length;
        while (row_start >= 0 && row_end < mat.length) {
                int row_mid = (row_start + row_end)/2;
                int col_mid =  (col_start + col_end)/2;

                if(X==mat[row_mid][col_mid])
                {
                    return 1;
            }
//                Check if  X is in the range of the particular row or not
            if(X>=mat[row_mid][col_start]  && X<=mat[row_mid][col_end])
            {
//                Apply Binary Search here
                while(col_start<=col_end)
                {
                    int mid =  (col_start + col_end)/2;
                    if(mat[row_mid][mid]==X){
                        return 1;
                    }

                    if(mat[row_mid][mid]>X)
                    {
                        col_end = mid -1;
                    }
                    else{
                        col_start = mid+1;
                    }
                }
                return 0;

            }

            if(X<mat[row_mid][col_start]){
                row_end =  row_mid -1;
            }
            else{
                row_start = row_mid +1;
            }

        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
