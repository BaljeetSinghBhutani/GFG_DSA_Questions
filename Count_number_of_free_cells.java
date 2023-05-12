package GFG_DSA_Questions;

import java.util.Arrays;
import java.util.HashSet;

public class Count_number_of_free_cells {
  static long[] countZero(int N, int K, int[][] arr) {

      //Method -2
      HashSet<Integer> row = new HashSet<>();
      HashSet<Integer> col = new HashSet<>();

      long ans[] = new long[K];
      int index = 0;
      int r = 0;
      int c = 0;
      int nooffreecells = N * N;
      int countr = 0;
      int countc = 0;

      for (int i = 0; i < arr.length; i++) {
          int ar[] = arr[i];
          if (row.contains(ar[0])) {

          } else {
              countr += N - c;
              row.add(ar[0]);
              r++;
          }


          if (col.contains(ar[1])) {

          } else {
              countc += N - r;
              col.add(ar[1]);
              c++;
          }

          nooffreecells = (N * N) - (countr + countc);
          ans[index] = nooffreecells;
          index++;

      }


      return ans;
  }



      // Method -1
//        long result[]  = new long[K];
//        int start = 0;
//        int total =  N*N;
//
//        int count  = 0;
//    int matrix[][] = new int[N][N];
//    for(int i = 0; i<K; i++){
//        int ans[] =  arr[i];
//        int row = ans[0]-1;
//        int col = ans[1]-1;
//
//
//        int i1 = 0;
//        while(i1<arr.length){
//            if(matrix[row][i1]==1){
//                i1++;
//            }
//            else {
//                matrix[row][i1] = 1;
//                i1++;
//                count++;
//            }
//        }
//        int j1  = 0;
//        while(j1<arr.length){
//            if(matrix[j1][col]==1){
//                j1++;
//            }
//            else {
//                matrix[j1][col] = 1;
//                j1++;
//                count++;
//            }
//        }
//    result[start] =  total - count;
//        start++;
//
//    }
//return result;

//    }
//  }
    public static void main(String[] args) {
        int N = 3;
        int K =  3;

int arr[][] = {
        {2 ,2},
        {2 ,3},
        {3, 2}

};
long ans [] =  countZero(N, K, arr);
        System.out.println(Arrays.toString(ans));
    }
}
