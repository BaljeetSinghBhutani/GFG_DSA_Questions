package GFG_DSA_Questions;

public class Binary_Matrix_having_maximum_Number_of_1s {
    public int[] findMaxRow(int mat[][], int N) {


        int ans[] = new int[2];
        int MaxOneCount = 0;
        int rows = 0;

        for(int i= 0; i<mat.length; i++)
        {
           int one = 0;
            for(int j =0; j<mat[i].length; j++)
            {
                if(mat[i][j]==1)
                {
                  one++;
                }
            }

            if(one>MaxOneCount)
            {
                rows =i;
                MaxOneCount = one;
            }

        }
        ans[0] = MaxOneCount;
        ans[1]  = rows;
    return ans;

    }
    public static void main(String[] args) {

    }
}
