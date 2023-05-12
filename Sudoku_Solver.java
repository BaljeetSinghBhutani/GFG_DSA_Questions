package GFG_DSA_Questions;

public class Sudoku_Solver {
    public static  void solveSudoku(char[][] board) {

        int i = 0;
        int j= 0;
        sudoku(board, i, j);



    }

    private  static  void sudoku(char[][] board, int i, int j) {
        if(i==board.length)
        {
            return;
        }
        int ni = 0;
        int nj  = 0;

        if(j==board[0].length-1)
        {
            ni  = i+1;
            nj  =0;

        }
        else{
            ni  = i;
            nj  = j+1;
        }
        if(board[i][j]!='.')
        {
            sudoku(board, ni, nj);
        }
        else{

            for(int po =1; po<=9; po++)
            {
                if(isValid(board, (char) (po + '0'), i, j));
                {
                    board[i][j] = (char) (po + '0');
                    sudoku(board, ni,  nj);
                    board[i][j] = '.';
                }

            }
        }
    }

    private static boolean isValid(char[][] board, char val, int i, int j) {

        //row
        for(int i1 = 0; i1<board[0].length; i1++)
        {
            if(board[i][i1]==val){
                return false;
            }
        }

        //column
        for(int i1 = 0; i1<board.length; i1++)
        {
            if(board[i1][j]==val){
                return false;
            }
        }


        //sub matrix

        int smi = 3 * (i/3);
        int smj = 3 * (j/3);


        for(int i1 = 0; i1<3; i1++)
        {
            for(int j1  = 0; j1<3; j1++)
            {
                if(board[smi+i1][smj+j1]==val)
                {
                    return false;
                }
            }
        }


        return true;
    }
    public static void main(String[] args) {

    }
}
