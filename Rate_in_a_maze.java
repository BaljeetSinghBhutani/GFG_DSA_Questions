package GFG_DSA_Questions;

import java.util.ArrayList;

public class Rate_in_a_maze {
    public static ArrayList<String> findPath(int[][] maze, int n) {
ArrayList<String> list = new ArrayList<>();
String str  = "";
int path[][] =new int[n][n];
if(maze[0][0]==0)
{
    return list;
}

returnpath(maze, 0, 0, path, list, str);
return list;
    }

    private static void returnpath(int[][] maze, int i, int j, int[][] path, ArrayList<String> list, String str) {
        int n = maze.length;
        if (i == n - 1 && j == n - 1) {
            list.add(str);
            return;
        }

// We have to move Lexographically so we will take DLRU

            path[i][j] = 1;


//        Down
        if(itssafe(maze, i+1, j, path))
        {
returnpath(maze, i+1, j, path, list, str+ 'D');
        }

//        Left
   if(itssafe(maze, i, j-1, path))
        {
returnpath(maze, i, j-1, path, list, str+ 'L');
        }

//   Right
   if(itssafe(maze, i, j+1, path))
        {
returnpath(maze, i, j+1, path, list, str+ 'R');
        }

//   Up

        if(itssafe(maze, i-1,j , path))
        {
            returnpath(maze, i-1, j, path, list, str+ 'L');
        }
path[i][j] = 0;
    }

    private static boolean itssafe(int[][] maze, int i, int j, int[][] path) {
        int n = maze.length;
        if(i<0 || i>= n || j<0 || j>=n || maze[i][j]==0 || path[i][j] ==1)
        {

            return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int maze[][] = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
    };

        ArrayList<String>  list= findPath(maze, maze.length);
        System.out.println(list);
   }
}
