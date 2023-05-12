package GFG_DSA_Questions;

public class Rotate_by_90_degree {
    public static void rotateby90(int matrix[][], int n)
    {
//          Method -2

        for(int i =0; i<n; i++)
        {
            for(int j =i; j<n; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

            }
        }


        int row_start = 0;
        int row_End  = n-1;

        for(int i  =0; i<n; i++)
        {
            row_start = 0;
            row_End = n-1;

            while(row_start<=row_End)
            {
                int temp  = matrix[row_start][i];
               matrix[row_start][i] = matrix[row_End][i];
                matrix[row_End][i] = temp;
                row_End--;
                row_start++;

            }
        }


//         Method -1 (using an Extra Space)

//int ans[][]= new int[n][n];
//int rows = 0;
//int cols = n-1;
//for(int i =0; i<n; i++)
//{
//    for(int j =0; j<n; j++)
//    {
//     int temp  =   matrix[rows][cols];
//     matrix[rows][cols] = matrix[i][j];
//                matrix[i][j] = temp;
//        rows++;
//    }
//    rows = 0;
//    cols--;
//}
//for(int i =0; i<n; i++)
//{
//    for(int j  =0; j<n; j++)
//    {
//        System.out.print(matrix[i][j] + " ");
//    }
//    System.out.println();
//}

    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                {4, 5, 6},
        {7, 8, 9}
    };
        rotateby90(arr, arr.length);

        for(int i =0; i<arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
    }
}
