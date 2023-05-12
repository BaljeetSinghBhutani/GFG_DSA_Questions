package GFG_DSA_Questions;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

public class Rat_in_a_Maze_I {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans  = new ArrayList<>();
        if(m[0][0]==0)
        {
            return ans;
        }

        boolean visited[][] = new boolean[n][n];
        String path = "";
        allpath(ans, visited, m, 0, 0, n, path);

        return ans;

    }

    private static void allpath(ArrayList<String> ans, boolean[][] visited, int[][] m, int row, int col, int n, String path) {





        if(row==n-1 &&  col==n-1){


            ans.add(path);
            return;
        }


        visited[row][col] = true;


        //Down
        if(PathisPossible(visited, m, row+1, col, n)){
            allpath(ans, visited, m, row + 1, col, n, path +'D');
        }
        //Left

        if(PathisPossible(visited, m, row, col-1, n)){
            allpath(ans, visited, m, row, col-1, n, path + 'L');
        }
        //Right
        if(PathisPossible(visited, m, row, col+1, n)){
            allpath(ans, visited, m, row , col+1, n, path + 'R');
        }
        // Up
        if(PathisPossible(visited, m, row-1, col, n)){
            allpath(ans, visited, m, row -1, col, n, path +'U');
        }







        visited[row][col] = false;

    }
    public static boolean PathisPossible(boolean[][] visited, int[][] m, int row, int col, int n){
        if(row>=n || col>=n ||  row<0|| col<0|| visited[row][col]==true || m[row][col]==0)
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
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
            returnpath(maze, i-1, j, path, list, str+ 'U');
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

}