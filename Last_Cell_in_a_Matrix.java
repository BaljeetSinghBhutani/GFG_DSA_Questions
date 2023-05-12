package GFG_DSA_Questions;

import java.util.Arrays;

public class Last_Cell_in_a_Matrix {

    static int [] endPoints(int [][]matrix, int R, int C){

        int exit[] = new int[2];
        String lastD =  "r";
        int i = 0;
        int j = 0;

        while(i>=0 && i<R &&  j>=0 && j<C)
        {
            exit[0] = i;
            exit[1] = j;


            if(matrix[i][j]==1){
                matrix[i][j]= 0;
                lastD =  changeDirection(lastD);
            }
          int updatedIndex[] = DirectedCoordinates(lastD, i, j);
            i = updatedIndex[0];
            j = updatedIndex[1];
        }

        return exit;
    }


    private static String changeDirection(String lastD) {
//        String str = "";
        if(lastD=="u"){
            lastD = "r";
        }

        else if (lastD=="r"){
            lastD = "d";
        } else if (lastD == "d") {

            lastD ="l";
        }
        else{
            lastD="u";
        }
return lastD;

    }

    private static int[] DirectedCoordinates(String lastD, int i, int j) {

        int arr[] = new int [2];
        if(lastD=="u"){
            i--;
        }
        else if(lastD=="r"){
            j++;

        } else if (lastD=="d") {

            i++;
        }
        else {
            j--;
        }

        arr[0] = i;
        arr[1] =  j;
        return arr;
    }


    public static void main(String[] args) {
int matrix [][] ={{0, 1},
                 {1, 0}};

int arr[] = endPoints(matrix, 2, 2);
        System.out.println(Arrays.toString(arr));

    }
}
