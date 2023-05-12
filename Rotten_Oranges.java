package GFG_DSA_Questions;


import java.util.ArrayDeque;
import java.util.Queue;

public class Rotten_Oranges {

    class Pair<T, V>
    {
       T first;
       V second;
    }

    public boolean isvalid(int i, int j, int n, int m, int [][] grid)
    {
        if(i>=0 && i<n && j>=0 && j<m && grid[i][j]==1)
        {
            return true;
        }
        return false;

    }
    public int orangesRotting(int[][] grid)
    {
        int n =  grid.length;
        int m =  grid[0].length;
        Queue<Pair<Integer, Integer>> queue =  new ArrayDeque<>();
        int fresh = 0;
        int time  = 0;

        for(int i =0; i<n; i++)
        {
            for(int j = 0; j<m; j++)
            {
                if(grid[i][j]==2)
                {
                    Pair<Integer, Integer> pair  = new Pair<>();
                    pair.first =  i;
                    pair.second =  j;
                    queue.add(pair);
                }
                if(grid[i][j]==1)
                {
                    fresh++;
                }
            }
        }


//        Apply BFS

        while(!queue.isEmpty())
        {
            int size = queue.size();
            int temp = 0;

            while(size!=0)
            {
                Pair<Integer, Integer>  q = queue.remove();

                int x = q.first;
                int y =  q.second;

                int row[] = {-1, 0, 1, 0};
                int col[] =  {0, 1, 0, -1};

                for(int i =0; i<row.length;i++)
                {
                    int xcor =  x + row[i];
                    int ycor =  y+ col[i];

                    if(isvalid(xcor, ycor, n, m, grid)){

                        temp++;
                        grid[xcor][ycor]=2;
                        Pair<Integer, Integer> p = new Pair<>();
                        p.first =  xcor;
                        p.second =  ycor;
                        queue.add(p);

                    }
                }
                size--;
            }
            if(temp!=0)
            {
                time++;
            }
        }

        if(fresh==0)
        {
            return 0;
        }



        for(int i =0; i<n; i++) {
            for (int j = 0; j < m; j++) {
if(grid[i][j]==1)
{
    return -1;
}
            }
        }


        return time;



    }
}
